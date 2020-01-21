<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>getget</title>
</head>
<body>
getget<br>
${id }<br>${name }

<br>
<c:forEach items="${listmodel }" var="mem">
${mem.id } 회원 혼영합니다. ${mem.name}<br>
</c:forEach>
</body>
</html>