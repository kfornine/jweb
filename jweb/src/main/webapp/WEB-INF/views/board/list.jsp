<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type="text/javascript">
	if('${resMsg}'!=""){
		alert('${resMsg}');
	}
</script>
<h1>
	게시판
</h1>
<table border=1>
	<c:forEach items="${list}" var="list">
	<tr>
		<td><a href="/board/get?bnum=${list.bnum }">
		<c:out value="${list.title}"/></a></td>
		<td><c:out value="${list.content}"/></td>
		<td><c:out value="${list.regdate}"/></td>
		<td><c:out value="${list.memberid}"/></td>
		<td><c:out value="${list.hit}"/></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>