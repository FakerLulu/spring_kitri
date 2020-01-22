<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c"  uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 등록</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
</head>
<body>
<H1>사원등록</H1>
<FORM action="/mvc/mybatis/insertemp" method="post">
	<label for="id">사번</label>
	<input type="text" id="id" name="employee_id" ><br>
	
	<label for="laname">성 </label>
	<input type="text" id="laname" name="last_name" ><br>
	
	<label for="firname">이름</label>
	<input type="text" id="firname" name="first_name" ><br>
	
	<label for="email">이메일</label>
	<input type="text" id="email" name="email" ><br>
	
	<label for="job_id">직종코드</label>
	<select id="job_id" name="job_id" >
	<c:forEach items="${jobids }" var="jobid">
	<option>${jobid }</option>
	</c:forEach>

	</select><br>
	<input type="submit" value="제출">
</FORM>
</body>
</html>