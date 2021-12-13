<%@page import="java.net.http.HttpRequest"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("id");
	if(id != null){
		response.sendRedirect("sessionLogin2.jsp");		
	}
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="sessionLogin2.jsp" method="post">
	아이디:<input type="text" name="id"><br>
	비밀번호:<input type="password" name="pw"><br>
	<input type="submit" value="로그인">
	<input type="reset" value="다시 작성">
	
</form>
</body>
</html>