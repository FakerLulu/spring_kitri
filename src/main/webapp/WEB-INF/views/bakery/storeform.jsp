<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>빵상(인)</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
<h1>빵상 빵상</h1>
<form action="./storeform" method="post" enctype="multipart/form-data">
	제품 이름 : <input type="text" name="bakeryname"><br>
	제품 가격 : <input type="number" name="price"><br>
	제품 수량 : <input type="number" name="balance"><br>
	제품 사진 : <input type="file" name="bakeryimage"><br>
	<input type="submit" value="제출">
</form>
</body>
</html>