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
	String result = (String)request.getAttribute("result");
	if(result.equals("1")){
		out.println("<script>alert('로그인 성공')</script>");
		out.println("<script> window.location.href = '/20211216_exam/main.do';</script>");		
	}
	else{
		if(result.equals("0")){
			out.println("<script>alert('암호가 다름');</script>");
		}
		else{
			out.println("<script>alert('아이디가 없음');</script>");
			
		}
		out.println("<script> window.location.href = 'loginForm.jsp';</script>");
		
	}
%>
</body>
</html>