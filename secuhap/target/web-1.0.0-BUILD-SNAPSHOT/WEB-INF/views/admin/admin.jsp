<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	
	<table>
	
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>승인여부</th>
		</tr>
	
	
		<c:forEach items="${userList}" var="userdto">
	
		<tr>
			<td>${userdto.loginId}</td>
			<td>${userdto.loginPw}</td>
			<td>${userdto.checkId}</td>
		</tr>
	
	
		</c:forEach>
	</table>
	<input type="button" value="전체승인" onclick="location.href='/web/checkOk';">
	
