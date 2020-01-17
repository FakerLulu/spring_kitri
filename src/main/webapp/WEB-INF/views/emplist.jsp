<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	table{
	border-collapse: collapse;
	border : 2px solid navy;
	text-align: center;
	margin: auto;
	}
	table caption{
		font-size : xx-large;
		font-weight: bolder;
	}
	table * {
	border-collapse: collapse;
	border : 2px solid navy;
	}
</style>
<body>
<img alt="elsa" src="./resources/images/elsa.jpg" height="300px">
<table>
<caption>사원 조회</caption>
<thead>
<th>사번</th><th>이름</th><th>입사일</th><th>급여</th>
</thead>
<c:forEach  var="emp" items="${empList }">
	<tr><td>${emp.id}</td><td>${emp.name}</td><td>${emp.hiredate}</td><td> ${emp.salary}</td></tr>
</c:forEach>
</table>

</body>
</html>