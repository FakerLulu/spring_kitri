<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<body>
<h1 class="text-center">게시판 목록</h1>
<table class="table">
<tr>
<td>번호</td><td>${detail.seq }</td>
</tr>
<tr><td>제목</td><td>${detail.title }</td></tr>
<tr><td>작성자</td><td>${detail.writer }</td></tr>
<tr><td>작성시간</td><td>${detail.time }</td></tr>
<tr><td>조회수</td><td>${detail.viewcount }</td></tr>
<tr><td colspan="2">${detail.contents }</td></tr>
</table>

</body>
</html>