<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>request 내장 객체 예제</title>
</head>
<body>
	<form action="requestResult.jsp" method="post">
		<fieldset><h2>학번, 이름, 학년, 선택과목을 입력하는 폼</h2>
		학번: <input type="text" name="num"><br>
		
		이름: <input type="text" name="name"><br>
		
		학년: <input type="radio" name="grade" id="grade1" value="1학년" checked>
			 <label for="grade1">1학년</label>&nbsp;&nbsp;
			 <input type="radio" name="grade" id="grade2" value="2학년">
			 <label for="grade2">2학년</label>&nbsp;&nbsp;
			 <input type="radio" name="grade" id="grade3" value="3학년">
			 <label for="grade3">3학년</label>&nbsp;&nbsp;
			 <input type="radio" name="grade" id="grade4" value="4학년">
			 <label for="grade4">4학년</label>&nbsp;&nbsp; 
			 <br>
			 
		선택과목: <select name="subject">
       				<option value="JAVA">JAVA</option>
       				<option value="ORACLE">ORACLE</option>
       				<option value="JAVASCRIPT">JAVASCRIPT</option>
        			<option value="JQUERY">JQUERY</option>
    			</select> 
    			<br>
    			
    		  <input type="submit" value="입력완료">	
		</fieldset>
	</form>
</body>
</html>