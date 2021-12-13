<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id2 = request.getParameter("id2");
	String pw2 = request.getParameter("pw2");
	String id_attr = (String)session.getAttribute("id");
	
	
%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	out.println("id2: " + id2+ " -- pw2: " + pw2);
	out.println("id_attr: " + id_attr);
	// request로 attribute를 저장해도 include 또는 forward가 아니면 받을 수 없다.
	out.println("req: " + (String)request.getAttribute("req"));
	
	session.removeAttribute("id");
%>
<h3>로그아웃 되었습니다.</h3>
<a href="sessionLogin.jsp">로그인 페이지로 이동</a>
</body>
</html>