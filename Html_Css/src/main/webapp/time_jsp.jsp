<!--  �������� ����� ���� -->
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

	Jsp: Web �������� ����Ǵ� �� �ٸ� �ڹ�<br>
	JSP(MVC Model 1): Client�� ��û(http://localhost/time_jsp.jsp)�� ������ jsp�� �޾Ƽ� ó���� �� 
					 html������ browser���� ����<br>
					 
	JSP(MVC Model 2): Client�� ��û�� servlet�� �޾Ƽ� ó���� �� 
					 jsp�� ���ؼ� browser���� html ���� ����<br>		
	<a href="https://tenlie10.tistory.com/2">mvc1, mvc2 ���� ����</a>				 		 
	<%
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("������ �ð��� �ܼ� ��� : " + hour + "�� " + minute + "�� " + second +"��");
		// out ==> JspWriter		
		// out.println(����) => �� ȭ��(������)�� ���
		out.println("<br><br>");
		out.println(hour + "�� " + minute + "�� " + second +"��<br>");
	%>
	Web���� ���� �ð��� <%=hour %>�� <%=minute %>�� <%=second %>�� 
</body>
</html>