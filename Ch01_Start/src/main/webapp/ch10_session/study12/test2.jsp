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
<h3>세션 정보</h3>
Attribute id값: <%= request.getSession().getAttribute("id") %><br>
isNew() : <%= session.isNew() %><br>
세션 생성 시간: <%= new java.util.Date(session.getCreationTime()).toString() %><br>
세션 생성 시간: <%= new java.util.Date(session.getLastAccessedTime()).toString() %><br>

<a href="test3.jsp">세션 삭제하기</a>
</body>
</html>