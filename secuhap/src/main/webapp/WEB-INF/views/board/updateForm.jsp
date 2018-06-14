<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	<p class="w3-left" style="padding-left: 30px;"></p>
	<div class="w3-container">

		<center>
			<b>글수정</b> <br>
			<form method="post" name="writeform" action="updatePro">
				<%-- <input type="hidden" name="num" value="${article.num}">
<input type="hidden" name="pageNum" value="${pageNum}">
<input type="hidden" name="ref" value="0">
<input type="hidden" name="re_step" value="0">
<input type="hidden" name="re_level" value="0"> --%>

				<table class="w3-table-all" style="width: 70%;">
					<c:forEach items="${list2}" var="dto">
						<tr>
							<td align="right" colspan="2"><a href="list"> 글목록</a></td>
						</tr>
						<tr>
							<td width="70" align="center">이 름</td>
							<td width="330"><input type="text" size="10" maxlength="10"
								name="writer" value="${dto.writer}"></td>
						</tr>
						<tr>
							<td width="70" align="center">제 목</td>
							<td width="330"><input type="text" size="40" maxlength="50"
								name="subject" value="${dto.subject}"></td>
						</tr>
						<tr>
							<td width="70" align="center">Email</td>
							<td width="330"><input type="text" size="40" maxlength="30"
								name="email" value="${dto.email}"></td>
						</tr>
						<tr>
							<td width="70" align="center">내 용</td>
							<td width="330"><textarea name="content" rows="13"
									cols="40">${dto.content}</textarea></td>
						</tr>
						<tr>
							<td width="70" align="center">비밀번호</td>
							<td width="330"><input type="password" size="8"
								maxlength="12" name="passwd"></td>
						</tr>
						<tr>
							<td colspan=2 align="center"><input type="submit"
								value="글쓰기"> <input type="reset" value="다시작성">
								<input type="button" value="목록보기"
								OnClick="window.location='list'"></td>
						</tr>
						
						<input type="hidden" name="num" value="${dto.num}">
					</c:forEach>
				</table>

			</form>
		</center>
	</div>

</body>



</html>