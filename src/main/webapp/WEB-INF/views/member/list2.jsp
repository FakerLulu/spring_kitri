<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list2</title>
</head>
<body>
<h1>모든 회원 정보</h1>
<c:forEach items="${listmodel }" var="mem">
${mem.id } 회원 혼영합니다. ${mem.name}<br>
</c:forEach>

</body>
</html>