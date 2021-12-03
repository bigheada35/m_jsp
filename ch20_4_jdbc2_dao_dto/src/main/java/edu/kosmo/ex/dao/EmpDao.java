package edu.kosmo.ex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import edu.kosmo.ex.dto.EmpDto;

public class EmpDao {

	private String driver = "oracle.jdbc.driver.OracleDriver";
	
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String uid = "scott";
	private String upw = "tiger";


		
	public EmpDao() {
		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}

	//
	//  이제는  에레로 많이 가져다 쓴다.
	//
	//    주의 :  반드시 외워.
	//
	public ArrayList<EmpDto> empSelect(){
		
		ArrayList<EmpDto> dtos = new ArrayList<EmpDto>();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try { 
			String query = "select * from emp";
			con = DriverManager.getConnection(url, uid, upw);
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				
			
				EmpDto dto = new EmpDto(empno, ename,  job);
				dtos.add(dto);
				
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				// 주의 :  생성된 순서가 있다.  그래서
				// 꺼꾸로 close 를 시켜야 한다.
				//  주의 : 
				if(rs != null ) rs.close();
				if(stmt != null ) stmt.close();
				if(con != null ) con.close();
				
			}catch(Exception e) {
				
			}
			
		}
		
		
		
		return dtos;
		
	}
		
		

	
	
}
