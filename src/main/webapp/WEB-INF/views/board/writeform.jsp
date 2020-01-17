<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<style>
form{
width : 50%;
margin : auto;
}
</style>
<body>
<h1 class="text-center">글쓰기</h1>
<form action="./write.board" method="post" >
<div class="form-group">
<label for="title">제목</label> <input class="form-control" id="title" type="text" name="title">
</div>
<div class="form-group">
<label for="writer">작성자</label> <input class="form-control" id="writer" type="text" name="writer"></div>
<div class="form-group">
<label for="cont">내용</label> <textarea class="form-control" id="cont" name="contents"></textarea><br>
<label for="pw">암호</label>  <input class="form-control" id="pw" type="password" name="password"></div>
<div class="form-group">
<input class="btn btn-default" type="submit" value="쓰기"></div>
</form>
</body>
</html>