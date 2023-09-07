<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>pickUp.jsp</h1>
	<h2>주문하기</h2>
	<h3>메뉴</h3>
	<h3>주문금액</h3>
	주소 : <input type="text" name="address" placeholder="주소를 입력하세요"> <br>
	요청사항 : <textarea rows="5" cols="20" name="content" placeholder="요청사항을 입력하세요"></textarea> <hr>
	
	<input type="button" value="결제하기"
							onclick="location.href='pickUpPay.jsp';">
</body>
</html>