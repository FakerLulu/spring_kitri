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

<h2>검색 된 회원들</h2>
<c:forEach items="${resultlist }" var="mem">
${mem.id } 회원 혼영합니다. ${mem.name}<br>
</c:forEach>


<%-- 	<c:if test="${item == 'id'}">
		<c:forEach items="${resultlist }" var="mem">
			<c:if test="${mem.id.contains(word)}">
			${mem.id } 회원 혼영합니다. ${mem.name}<br>
			</c:if>
		</c:forEach>
	</c:if>
	컨트롤러에서 처리 안한 경우 여기서 처리할떄
 --%>


</body>
</html>