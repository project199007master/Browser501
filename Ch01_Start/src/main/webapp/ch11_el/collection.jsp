<%@page import="ch11_el.Member"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
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
	//(1)Array
	String winner[] = new String[3];
	winner[0] = "홍길동1";
	winner[1] = "홍길동2";
	winner[2] = "홍길동3";
	
	request.setAttribute("w", winner);
	
	// (2) ArrayList
	// 딸기, 오렌지, 복숭아
	ArrayList<String> fruit = new ArrayList<String>();
	fruit.add("딸기");
	fruit.add("오렌지");
	fruit.add("복숭아");
	
	request.setAttribute("FRUIT", fruit);
	
	
	
	// 3.Map
	// hong1= a1, hong2= a2, hong3 = a3
	HashMap<String, String> nMap = new HashMap<String, String>();
	nMap.put("hong1", "a1");
	nMap.put("hong2", "a2");
	nMap.put("hong3", "a3");
	
	request.setAttribute("NAME", nMap);
	
	//4.Bean
	// Member 데이터 저장 : id:abcd, name:hong
	Member member = new Member();
	member.setId("abcd");
	member.setName("hong");
	
	request.setAttribute("bean", member);
	
	RequestDispatcher d = request.getRequestDispatcher("collectionResult.jsp");
	d.forward(request, response);
%>
</body>
</html>