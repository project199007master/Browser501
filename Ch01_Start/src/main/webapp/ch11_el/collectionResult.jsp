<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	
%>
	
</body>
</html>