<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="bean" class="ch11.LoginBean"></jsp:useBean>
<jsp:setProperty property="*" name="bean"></jsp:setProperty>
<h3>ID, PW를 EL형태로 입력 받기 연습</h3>
사용자 아이디: ${bean.userid }<br>
사용자 비밀번호: ${bean.passwd }<br>
<hr>
&lt;jsp:getProperty> <br>
사용자 아이디: <jsp:getProperty property="userid" name="bean"/><br>
사용자 비밀번호: <jsp:getProperty property="passwd" name="bean"/><br>
</body>
</html>