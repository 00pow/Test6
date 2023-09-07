<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
div{
border: 1px solid ;
}
</style>

</head>
<body>
<section>

<div>
	<h1>장바구니(포장)페이지</h1>
	<h2>장바구니목록</h2>
</div>

<div>
	<h1>짜잔집</h1>
	
</div>
	
<div>
	<h3>간자장</h3>
	<img src="../images/간자장.png"  width=500px>
</div>
		
<div>
	<h3>탕수육</h3>
	<img src="../images/탕수육.png" width=500px>
</div>
							
	<fieldset>  
	<input type="button" value="더 담으러가기"
							onclick="location.href='goRestaurant.re';">
		<form action="./pickUp.re" method="post" name="fr" onsubmit="return check();">
		
			<input type="submit" value="포장하기">
		</form>
	</fieldset>
							
	</section>						
							
							
</body>
</html>