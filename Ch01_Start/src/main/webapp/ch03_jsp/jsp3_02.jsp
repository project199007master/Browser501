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
	//int a = Integer.parseInt(request.getParameter("a"));
	//int b = Integer.parseInt(request.getParameter("b"));
	
	int a= 2;
	int b= 3;
	
%>
기본 표현식<br>
a * b = <%= a * b %>
<hr>

el 표현식<br>

a * b = ${param.a * param.b}
<hr>

출력 하려면 url 창에 ?a=3&b=4 더할 것
<hr><hr>
<jsp:include page="header.jsp" flush="true"/>
</body>
</html>