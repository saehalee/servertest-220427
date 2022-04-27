<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="resources/jquery-3.6.0.min.js"/>
<script>
	$(document).ready(function(){
			//jquery code
	});
</script>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
</head>
<body>
<h1>${name}</h1>
<c:if test="${result == 1}">
	<h3>회원 정보 수정 완료</h3>
</c:if>
<c:if test="${result != 1}">
	<h3>회원 정보 수정 미완료</h3>
</c:if>

<a href="membermybatislist">회원리스트보러가기</a>
</body>
</html>