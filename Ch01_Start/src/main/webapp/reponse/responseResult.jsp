<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>responseResult.jsp</title>
</head>
<body>
지금 페이지는 <b>responseResult.jsp</b> 이다.<br>


전달값: <%= request.getParameter("id") %>
<%
	String ids = (String)request.getAttribute("ids");
	out.println("ids: " + ids);
%>


</body>
</html>