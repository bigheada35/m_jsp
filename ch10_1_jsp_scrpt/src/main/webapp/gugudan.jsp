<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<%
		for(int i =1 ; i<= 9; i++){
			for(int j=1; j<=9; j++){
				out.println ( i + " * " + j + "= " + i*j + "<br>");
			}
			out.println("<br>");
		}
	
	%>
	====== test2 ======<br>
	<%! int i, j;
	%>
	
	<%
		for(i =1 ; i<= 9; i++){
			for(j=1; j<=9; j++){		
	%>
			====<%=i %> X <%=j %> = <%=i*j %>  == <br> 
	<%
			}
		%>
			<br>
		<%	
		}
	%>
	
	
	
	
</body>
</html>