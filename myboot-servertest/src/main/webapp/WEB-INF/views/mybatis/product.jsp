<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${productdto.productName}의 상세페이지</title>
<script src="resources/jquery-3.6.0.min.js"></script>
<script>
	$(document).ready(function(){
			//jquery code
	});
</script>
</head>
<body>

<h3>상품코드 : ${productdto.productCode}<br>
	상품명 : ${productdto.productName}<br>
	상품가격 : ${productdto.price}<br>
	제조회사 : ${productdto.company}<br>
	제고량 : ${productdto.balance}<br>
	입고일 : ${productdto.regdate}<br>
</h3>
</body>
</html>