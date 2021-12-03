package edu.kosmo.ex.dto;

public class EmpDto {
	
	private int empno;	
	private String ename;
	private String job;
	
	
	public EmpDto() {}

	public EmpDto(int empno, String ename, String job) {
	
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	
	
	
	
	public String getEname() { 
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	
	
}
