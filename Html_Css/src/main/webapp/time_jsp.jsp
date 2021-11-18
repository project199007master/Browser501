<!--  서버에서 수행될 사항 -->
<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>

	Jsp: Web 서버에서 실행되는 또 다른 자바<br>
	JSP(MVC Model 1): Client의 요청(http://localhost/time_jsp.jsp)을 서버의 jsp가 받아서 처리한 후 
					 html문서로 browser에게 전달<br>
					 
	JSP(MVC Model 2): Client의 요청을 servlet이 받아서 처리한 후 
					 jsp를 통해서 browser에게 html 문서 전달<br>		
	<a href="https://tenlie10.tistory.com/2">mvc1, mvc2 관련 문서</a>				 		 
	<%
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("서버의 시간을 콘솔 출력 : " + hour + "시 " + minute + "분 " + second +"초");
		// out ==> JspWriter		
		// out.println(내용) => 웹 화면(브라우저)에 출력
		out.println("<br><br>");
		out.println(hour + "시 " + minute + "분 " + second +"초<br>");
	%>
	Web에서 현재 시간은 <%=hour %>시 <%=minute %>분 <%=second %>초 
</body>
</html>