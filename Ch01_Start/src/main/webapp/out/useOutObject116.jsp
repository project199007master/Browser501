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
	out.println("안녕하세요!"+"<br>");
	System.out.println("안녕하세요!");
%>
<%= "hello2" %><br>
버퍼 크기:: <%= out.getBufferSize() %><br>
버퍼의 남은 크기:: <%= out.getRemaining() %><br>
autoFlush: <%= out.isAutoFlush() %><br>
</body>
</html>