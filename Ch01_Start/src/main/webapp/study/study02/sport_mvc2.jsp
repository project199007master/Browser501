<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
좋아하는 운동:
<%
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html; charset=utf-8");
	String[] sports = request.getParameterValues("sport");
	String gender = request.getParameter("gender");	
	
	if(sports != null) {
		for(int i=0; i<sports.length; i++) {
			out.println(sports[i]+ " ");
		}
	}
	else
		out.println("없음");		
	
	out.println("<br>");
	if(gender != null)
	out.println("성별: " + gender);
	else
		out.println("성별 선택 X");
%>
<hr>

<%
	String[] sp2 = (String[])session.getAttribute("s1");
	Enumeration<String> sports2 = session.getAttributeNames();
	String gender2 = (String)session.getAttribute("s2");	
	
	 if(sp2 != null) {
		for(int i=0; i<sp2.length; i++) {
			out.println("세션: " + sp2[i]);
		}
		out.println("<br>");
	}
	else
		out.println("없음");	
	
	
	while(sports2.hasMoreElements()){
		String sessionName = sports2.nextElement().toString();
		String sessionValue = (String)session.getAttribute(sessionName).toString();
		out.println("Name::" + sessionName +"<br>");
		out.println("Value::" + sessionValue +"<br>");
	}
	
	out.println("<br>");
	if(gender2 != null)
	out.println("성별: " + gender2);
	else
		out.println("성별 선택 X");
%>


sport:: ${param.sports}<br>
gender:: ${param.gender}<br>

<hr>
id(JSP): <%= request.getParameter("id") %><br>
id(EL): ${param.id}



</body>
</html>