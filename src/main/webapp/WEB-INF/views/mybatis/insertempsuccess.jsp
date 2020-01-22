<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>등록 결과</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
<c:choose>
<c:when test="${result == 1 }"> <h1>성공</h1> </c:when>
<c:when test="${result == 0 }"> <h1>실패</h1> </c:when>
</c:choose>
${vo.employee_id} ${vo.first_name} ${vo.last_name} ${vo.email} ${vo.job_id} 
</body>
</html>