<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1> bo_b_insertForm.jsp(Foly) </h1>

<fieldset>  
		<!-- 	유효성체크->폼테그에 이름넣기 -->
		<!--서브밋 버튼이 눌러졌을 때 체크라고 하는 이름의 자바스크립트를 호출 -->
		<!--서브밋 눌리면 insertPro 라는 페이지로 연결된다 -->
		<form action="./bo_b_insertPro" method="post" name="fr" onsubmit="return check();">
		
		식당 이름 : <input type="text" name="res_name"><br>
		메뉴 이름 : <input type="text" name="bo_menu"><br>
		수량 : <input type="number" name="bo_count"><br>
		<!-- 옵션 추가 : <input type="checkbox" name=""><br> -->
		가격 : <input type="text" name= "bo_price"><br>
		
			<input type="submit" value="장바구니 담기">
		</form>
	</fieldset>

</body>
</html>