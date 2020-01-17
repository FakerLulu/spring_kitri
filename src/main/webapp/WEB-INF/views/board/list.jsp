<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>목록</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
form{
width:50%;
margin:auto;
}
</style>
<body>
<h1 class="text-center">게시판 목록</h1>
<table class="table table-striped table-hover ">
<thead>
<th>번호</th><th>제목</th><th>작성자</th><th>시간</th><th>조회수</th>
</thead>
<c:forEach items="${list }" var="board">
<tr>
<td>${board.seq }</td><td><a href="./detail.board?seq=${board.seq }">${board.title }</a></td><td>${board.writer }</td><td>${board.time }</td><td>${board.viewcount }</td>
</tr>
</c:forEach>
</table>

</body>
</html>