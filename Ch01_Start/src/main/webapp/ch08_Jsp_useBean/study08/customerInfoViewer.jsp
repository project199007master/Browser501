<%@page import="ch08_useBean.member.PersonalInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% request.setCharacterEncoding("utf-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
request영역으로부터 자바빈 객체 가져오기<br>
<!-- attribute에 설정된 name값과 useBean의 id값을 동일하게 하여 주소값을 가져온다 -->
<!-- scope속성을 이용하여 값을 받아올 수 있도록 한다.( 없으면 받아오지 못함 !!! 아마 page값이 기본값인듯) -->
<jsp:useBean id="pinfo" class="ch08_useBean.member.PersonalInfo" scope="request"/>  
이름 : <jsp:getProperty property="name" name="pinfo"/><br>
성별 : <jsp:getProperty property="gender" name="pinfo"/><br>
나이 : <jsp:getProperty property="age" name="pinfo"/>
</body>
</html>