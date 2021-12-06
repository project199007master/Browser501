<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
URL:: http://localhost:8080/Server_Serlvet/simple<br>
type:: date 한 경우 => 날짜 출력

결과(EL) :: ${result}
결과(JSP) :: <%= request.getAttribute("result") %>
</body>
</html>