<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>cartService.jsp</h1>
	<h2>장바구니목록</h2>
	
	<input type="button" value="더 담으러가기"
							onclick="location.href='goRestaurant.re';">

							
	<fieldset>  
		<form action="./pickUp.re" method="post" name="fr" onsubmit="return check();">
		
			<input type="submit" value="포장하기">
		</form>
	</fieldset>
							
							
							
							
</body>
</html>