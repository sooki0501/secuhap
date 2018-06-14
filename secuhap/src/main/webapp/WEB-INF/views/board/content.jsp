<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>게시판</title>
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<body>
	<p>
		<b>글내용 보기</b>
	</p>
	<c:forEach items="${list2}" var="dto">
		<div class="w3-container">
			<table class="w3-table-all" style="width: 80%;">

				<tr height="30">
					<td width="125" align="center">글번호</td>
					<td width="125" align="center">${dto.num}</td>
					<td width="125">조회수</td>
					<td width="125" align="center">${dto.readcount}</td>
				</tr>
				<tr height="30">
					<td width="125">작성자</td>
					<td width="125" align="center">${dto.writer}</td>
					<td width="125" align="center">작성일</td>
					<td align="center" width="125">${dto.reg_date}</td>
				</tr>
				<tr height="30">
					<td align="center" width="125">글제목</td>
					<td align="center" width="375" colspan="3">${dto.subject}</td>
				</tr>
				<tr height="30">
					<td align="center" width="125">글내용</td>
					<td align="left" width="375" colspan="3"><pre>
         ${dto.content}</pre></td>
				</tr>

			</table>



			<table>
				<tr height="30">
					<td colspan="4" class="w3-center"><input type="button"
						value="글수정"
						onclick="document.location.href='${pageContext.request.contextPath}/updateForm?num=${dto.num}'">
						&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" value="글삭제"
						onclick="document.location.href= 
        'deletePro?num=${dto.num}'">
						&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" value="답글쓰기"
						onclick="document.location.href
		='writeForm?num=${article.num}&ref=${article.ref}&re_step=${article.re_step}&re_level=${article.re_level}&pageNum=${pageNum}'">
						&nbsp;&nbsp;&nbsp;&nbsp; <input type="button" value="글목록"
						onclick="document.location.href='list?pageNum=${pageNum}'">
					</td>
				</tr>
			</table>

		</div>

	</c:forEach>
</body>
</html>

