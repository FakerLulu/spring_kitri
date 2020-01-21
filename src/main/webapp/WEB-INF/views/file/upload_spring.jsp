<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
<h1>파일 전송 폼</h1>
<form action="/mvc/upload.file" method="post" enctype="multipart/form-data">
보낸이	<input type="text" name="name" value="휴먼"><br>
설   명	<input type="text" name="description" value="파일 설명"><br>
	
파일 1	<input type="file" name="file1"><br>
파일 2	<input type="file" name="file2"><br>
<input type="submit" value="전송"><br>
</form>
</body>
</html>