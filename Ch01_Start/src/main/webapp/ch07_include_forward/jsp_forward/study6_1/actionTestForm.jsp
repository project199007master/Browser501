<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="actionTest.jsp" method="post" id="loginForm">

아이디:<input type="text" name="userID"><br>
암 호:<input type="password" name="userPwd"><br>
<input type="radio" value="user" name="loginCheck" checked="checked">사용자
<input type="radio" value="manager" name="loginCheck">관리자<br>
<input type="submit" value="로그인">

</form>


</body>
</html>