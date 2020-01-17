<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>글쓰기</h1>
<form action="./write.board">
제목 : <input class="form-control" type="text" name="title"><br>
작성자 : <input class="form-control" type="text" name="writer"><br>
내용 : <textarea  name="contents"></textarea><br>
암호 : <input class="form-control" type="password" name="password"><br>
<input class="btn btn-default" type="submit" value="쓰기"><br>
</form>
</body>
</html>