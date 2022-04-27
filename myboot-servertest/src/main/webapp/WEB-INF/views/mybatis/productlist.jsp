<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
			//jquery code
	});
</script>
</head>
<body>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<table>
	<tr><th>상품코드</th><th>상품명</th><th>상품가격</th><th>제조회사</th><th>제고량</th><th>입고일</th></tr>
	<c:forEach items="${productlist}" var="dto">
		<tr><td>${dto.productCode}</td><td><a href="/product?code=${dto.productCode}">${dto.productName}</a></td>
		<td>${dto.price}</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>