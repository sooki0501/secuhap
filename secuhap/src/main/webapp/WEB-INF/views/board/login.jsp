<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
	
	
	<div id="box">
	<form method="post" action="${pageContext.request.contextPath}/loginOk.action">
	<table id="tbl" class="table">
	<tr>
		<td>
			<h2> 로그인</h2>
		</td>
	</tr>
	<tr>
		<td>
		<input type="text" name="loginId" placeholder="아이디 입력하세요." required>
		</td>
	</tr>
	<tr>
		<td>
		<input type="password" name="loginPw" placeholder="비밀번호를 입력하세요" required >
		</td>

	</tr>
	<tr>
		<td>
			<input type="submit" id="login" value="로그인" class="form-control" >
		</td>
	</tr>

	</table>
	</form>
	</div>


