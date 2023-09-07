<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>goReservation.jsp</h1>
	<h2>예약하기</h2>
	
	
	날짜선택 : <input type="date" id="Date" name="reservDay" 
	min="today" max="2030-12-31"><br/>
	<script type="text/javascript">
	var now_utc = Date.now()
	var timeOff = new Date().getTimezoneOffset()*60000;
	var today = new Date(now_utc-timeOff).toISOString().split("T")[0];
	document.getElementById("Date").setAttribute("min", today);

	</script>
	
	<h2>시간선택</h2>
	<input type="time" id="reservTime" name="reservTime"
	min="10:00" max="18:00" step=3600><br/>
	
	인원 : <input type="number" name="personNum" min="1" max="99"
	> <br>
	
<!-- 	<a onclick="alert('예약이 완료되었습니다.');" style="cursor:pointer">예약하기</a> -->

	<hr>
	
	
<input type="button" value="예약하기(예약금 결제)"
							onclick="location.href='goPay.re';">
</body>
</html>