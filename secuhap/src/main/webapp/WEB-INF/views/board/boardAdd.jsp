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
	
		<form action="${pageContext.request.contextPath}/boardAddOk" method="post">
			
				<table>
					<tr>
						<th>번호</th>
						<td><input type="text" name="boardnum" style="width:500px;" requried/></td>
					</tr>
					<tr>
						<th>제목</th>
						<td><input type="text" name="subject" style="width:500px;" requried/></td>
					</tr>
					<tr>
						<th>쓴자</th>
						<td><input type="text" name="writer" style="width:500px;" requried/></td>
					</tr>
					<tr>
						<th>내용</th>
						<td><textarea name="contentq" style="height:300px; width:500px; resize:none;" requried></textarea></td>
					</tr>
				</table>
	
			<hr style="width:700px;">
			<input type="button" value="취소하기" class="btn" onclick="history.back();"/>
			<input type="submit" value="글쓰기" class="btn"/>
			</form>
	

	