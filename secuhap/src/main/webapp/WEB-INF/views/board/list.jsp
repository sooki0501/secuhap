<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>


<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<style>
a {
	text-decoration: none;
}
</style>
<p class="w3-left" style="padding-left: 30px;"></p>
<div class="w3-container">

		<span class="w3-center  w3-large">
			<%-- <h3>(전체 글:${count})</h3> --%>
			<h3> 게 시 판  </h3>
		</span>
	
	<p class="w3-right w3-padding-right-large">
		<a href="writeForm">글쓰기</a>
	</p>
	<p class="w3-left w3-padding-left-large">
		<a href="logout">로그아웃</a>
	</p>
	<c:if test="${dto.readcount == 0}">

		<table class="table-bordered" width="700">
			<tr class="w3-grey">
				<td align="center">게시판에 저장된 글이 없습니다.</td>
		</table>
	</c:if>

	<table class="w3-table-all" width="700">
		<tr class="w3-grey">
			<td align="center" width="50">번호</td>
			<td align="center" width="250">제 목</td>
			<td align="center" width="100">작성자</td>
			<td align="center" width="150">작성일</td>
			<td align="center" width="50">조 회</td>
			<td align="center" width="50">filename</td>
			<td align="center" width="100">IP</td>
		</tr>




		<c:forEach items="${list}" var="dto">
			<tr>
				<td style="text-align: center;">${dto.num}</td>
				<td><a
					href="${pageContext.request.contextPath}/content?num=${dto.num}">${dto.subject}</a></td>
				<td style="text-align: center;">${dto.writer}</td>
				<td style="text-align: center;">${dto.reg_date}</td>
				<td style="text-align: center;">${dto.readcount}</td>
				<td style="text-align: center;">${dto.filename}</td>
				<td style="text-align: center;">${dto.ip}</td>

			</tr>
		</c:forEach>

	</table>
	<%-- <div class="w3-center">

		<c:if test="${count > 0 }">

			<c:if test="${startPage > bottomLine }">
				<a href="list?pageNum=${startPage - bottomLine}">[이전]</a>
			</c:if>
			<c:forEach var="i" begin="${startPage}" end="${endPage}">
				<a href="list?pageNum=${i}"> <c:if test="${i != currentPage}">[${i}]</c:if>
					<c:if test="${i == currentPage}">
						<font color='red'>[${i}]</font>
					</c:if></a>
			</c:forEach>
			<c:if test="${endPage < pageCount}">
				<a href="list?pageNum=${startPage+bottomLine}">[다음]</a>
			</c:if>

		</c:if>

	</div> --%>



</div>



</body>
</html>



