<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	Cookie[] cks = request.getCookies();
	for(Cookie ck : cks){
		out.println(ck.getName() + ", " + ck.getValue() + "<br>");
	}
	%>
</body>
</html>