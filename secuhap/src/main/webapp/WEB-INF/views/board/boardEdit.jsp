<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
	
</style>

	<h1>수정이다다다</h1>
	<form action="${pageContext.request.contextPath}/boardEditOk" method="post">
	<table>
	<c:forEach items="${vlist}" var="vdto">
		<tr>
			<th>번호</th>
			<td>${vdto.boardnum}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td><input type="text" name="subject" value="${vdto.subject}" /></td>
		</tr>
		<tr>
			<th >쓴자</th>
			<td><input type="text" name="writer" value="${vdto.writer}" /></td>
		</tr>
		<tr>
			<th>내용</th>
			<td><input type="text" name="contentq" value="${ivdto.contentq}" /></td>
		</tr>

		<input type="hidden" name="boardnum" value="${vdto.boardnum}" />
		<input class="btn btn-normal" type="button" value="뒤로가기" onclick="history.back();">
		<input class="btn btn-normal" type="button" value="글삭제" onclick="location.href='${pageContext.request.contextPath}/boardDel?boardnum=${vdto.boardnum}';">
		<input type="submit" value="수정하기">
	</c:forEach>		
	</table>
	</form>