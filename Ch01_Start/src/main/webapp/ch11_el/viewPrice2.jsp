<%@page import="ch11_el.FormatUtil"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="elfunc" uri="/WEB-INF/tlds/fn.tld" %>    

<%
	request.setAttribute("price", 12345L);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>EL함수 호출(274)</title>
</head>
<body>
EL에서 static method()를 사용하기 위한 방법-"클래스명.메소드 이름" 사용<br>
가격은 <b>${FormatUtil.number(price, '#,##0')}</b>
</body>
</html>