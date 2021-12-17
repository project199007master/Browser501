<%@page import="java.util.Map"%>
<%@page import="java.util.Set"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
(1)Array<br>
${w[0]}<br>
${w[1]}<br>
${w[2]}<br>
<hr>

<%
	//1. 배열
	//getAttribute, 반복문 사용
	String[] str = (String[])request.getAttribute("w");
	for(int i=0; i<str.length; i++){
		out.println(str[i] + "<br>");
	}
	out.println("<hr>");
		
	String[] str2 = (String[])request.getAttribute("w");
	for(String s:str2){
		out.println(s+" ");
	}
	
	out.println("<hr>");
%>
	
### Array:: JSTL<br>
<c:forEach var="i" items="${w}">
	${i}<br>
</c:forEach>
<hr>

2.ArrayList 출력<br>
${FRUIT[0]}<br>
${FRUIT[1]}<br>
${FRUIT[2]}<br>

<%	
	
	// 2. ArrayList 출력
	List<String> f = (List<String>)request.getAttribute("FRUIT");
	for(int i=0; i<f.size(); i++){
		out.println(f.get(i)+ " ");
	}
	out.println("<br>");
	
	ArrayList<String> f2 = (ArrayList<String>)request.getAttribute("FRUIT");
	out.println(f2+"<hr>");	
	
	
%>
<hr>
### ArrayList:: JSTL<br>
<c:forEach var="i" items="${FRUIT}">
	${i}<br>
</c:forEach>
<hr>


3.Map 출력<br>
${NAME["hong1"]}<br>
${NAME["hong2"]}<br>
${NAME["hong3"]}<br>
${NAME.hong1}<br>
${NAME.hong2}<br>
${NAME.hong3}<br>
<%
	Map<String,String> m = (Map<String,String>)request.getAttribute("NAME");
	for(String key : m.keySet()){
		out.println(m.get(key)+ " ");
	}
	out.println("<br>");
%>
<hr>
### HashMap:: JSTL<br>
<c:forEach var="i" items="${NAME}">
	${i}<br>
</c:forEach>
<hr>
<c:forEach var="entry" items="${NAME}">
	${entry.key} :: ${entry.value}<br>
</c:forEach>
<hr>

4. Member class 출력<br>
${bean.id}<br>
${bean.name}<br>	
</body>
</html>