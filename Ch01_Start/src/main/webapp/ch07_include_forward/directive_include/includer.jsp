<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Directive Include</title>
</head>
<body>
&lt;%@ include file="파일명" %>를 사용할 경우 ==> <b style="color:red">공용변수</b> 사용시<br>
<img src="directive.jpg"><br>
<%
	int number = 10;
%>
<!-- 조각파일(includee.jsp)을 붙여서 한 번에 컴파일 한다 -->
<%@ include file="includee.jspf" %>

공통변수 DATAFOLDER = "<%=dataFolder %>"
</body>
</html>