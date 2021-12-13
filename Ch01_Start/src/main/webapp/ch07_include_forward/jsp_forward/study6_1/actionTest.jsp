<%@page import="java.net.URLEncoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String userID = request.getParameter("userID");
	String userPwd = request.getParameter("userPwd");
	String loginCheck = request.getParameter("loginCheck");
	
	//request.setCharacterEncoding("utf-8");
	
	if(loginCheck.equals("user")){
%>
		<jsp:forward page="userMain.jsp">
			<jsp:param value='<%=URLEncoder.encode("전고객","utf-8") %>' name="userName"/>
		</jsp:forward>
<%		
	}else{
%>
		<jsp:forward page="managerMain.jsp">
			<jsp:param value='<%=URLEncoder.encode("관리","utf-8") %>' name="userName"/>
		</jsp:forward>
<%		
	}
%>
