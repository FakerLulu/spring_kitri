<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list3</title>
</head>
<body>
<h1>모든 회원 검색</h1>
<form action="./searchlist">
<select name="condition">
<c:forEach items="${searchmodel }" var="mem">
<option value="${mem}">${mem}</option>
</c:forEach>
</select>
<input type="text" id="search" name="searchword">
<input type="submit" value="검색">
</form>

<h2>검색 가능한 회원들</h2>
<c:forEach items="${listmodel }" var="mem">
${mem.id } 회원 혼영합니다. ${mem.name}<br>
</c:forEach>

</body>
</html>