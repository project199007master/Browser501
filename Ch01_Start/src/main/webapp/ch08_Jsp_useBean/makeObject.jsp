<%@page import="ch08_useBean.member.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	MemberInfo m1 = new MemberInfo();
	m1.setId("abcd");
	System.out.println("ID: " + m1.getId());
	out.println("ID: " + m1.getId()+"<hr>");
%>    
<jsp:useBean id="m2" class="ch08_useBean.member.MemberInfo" scope="request"></jsp:useBean>
<%
	m2.setId("admin");
	m2.setName("hong");
%>
<jsp:forward page="useObject.jsp"></jsp:forward>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
출력되지 않음
</body>
</html>