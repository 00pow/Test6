<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1></h1>
	
	<fieldset>  
		<!-- 	유효성체크->폼테그에 이름넣기 -->
		<!--서브밋 버튼이 눌러졌을 때 체크라고 하는 이름의 자바스크립트를 호출 -->
		<!--서브밋 눌리면 insertPro 라는 페이지로 연결된다 -->
		<form action="./bo_res.re" method="post" name="fr">
			<input type="hidden" value="1" name="own_num">
			<input type="submit" value="꼬막집">
		</form>
	</fieldset>
	
</body>
</html>