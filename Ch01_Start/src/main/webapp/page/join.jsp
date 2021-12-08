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
<!-- 
    1) action태그를 이용하여 멤버객체 생성하고 setProperty를 이용하여 데이터 setting
2) MemberDao를 이용하여 데이터를 입력하고 입력에 성공하면 ‘입력성공’이라는 메시지를 띄우고 main.jsp로 넘기시오
3) 실패하면 ‘입력에 실패 하였습니다’라는 경고창을 띄고 joimform.jsp를 돌아 가시오
-->
<jsp:useBean id="dao" class="java.AA" scope="scope"/>   
<jsp:setProperty property="id" name="dao" param="id"/>
<jsp:setProperty property="passwd" name="dao" param="pw"/>
<jsp:setProperty property="name" name="dao" param="name"/>
<jsp:setProperty property="date" name="dao" param="date"/> 

<%
	String id = dao.getId();
	String pw = dao.getPw();
	String name = dao.getName();
	Date date = dao.getDate();

	if(id != null && pw != null && name != null && date != null){
		
		response.sendRedirect("main.jsp");
	}
	else{
		out.println("<script>alert('실패')</script>");
		out.println("<script>history.back()</script>");
		
	}
	
%>





</body>
</html>