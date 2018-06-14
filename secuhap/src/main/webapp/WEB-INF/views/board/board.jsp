<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
<style>
	table {
		border : 1px solid black;
		border-collapse: collapse;
	}
	
	th, td {
		border: 1px solid black;
	}


</style>
	
	<table>
	
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>쓴자</th>
			<th>내용</th>
		</tr>
	
	
		<c:forEach items="${list}" var="listdto">
	
		<tr>
			<td>${listdto.boardnum}</td>
			<td><a href="${pageContext.request.contextPath}/boardView?boardnum=${listdto.boardnum}">${listdto.subject}</a></td>
			<td>${listdto.writer}</td>
			<td>${listdto.contentq}</td>
		</tr>
	
	
		</c:forEach>
	</table>
	<input type="button" value="글쓰기" onclick="location.href='${pageContext.request.contextPath}/boardAdd';">
	
