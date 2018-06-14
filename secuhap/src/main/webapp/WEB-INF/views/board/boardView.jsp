<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
	
</style>

	<h1>게시판이다다다다다</h1>
	<table>
	<c:forEach items="${vlist}" var="vdto">
		<tr>
			<th>번호</th>
			<td>${vdto.boardnum}</td>
		</tr>
		<tr>
			<th>제목</th>
			<td>${vdto.subject}</td>
		</tr>
		<tr>
			<th >쓴자</th>
			<td>${vdto.writer}</td>
		</tr>
		<tr>
			<th>내용</th>
			<td>${ivdto.contentq}</td>
		</tr>

		<input class="btn btn-normal" type="button" value="뒤로가기" onclick="history.back();">
		<input class="btn btn-normal" type="button" value="글삭제" onclick="location.href='${pageContext.request.contextPath}/boardDel?boardnum=${vdto.boardnum}';">
		<input class="btn btn-normal" type="button" id="iedit" name="iedit" value="수정하기" onclick="location.href='${pageContext.request.contextPath}/boardEdit?boardnum=${vdto.boardnum}';" >
	</c:forEach>		
	</table>


