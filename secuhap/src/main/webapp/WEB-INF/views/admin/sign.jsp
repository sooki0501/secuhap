<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>회원가입</title>
</head>

<style>
	table {
		border : 1px solid black;
		border-collapse: collapse;
	}
	
	th, td {
		border: 1px solid black;
	}


</style>

<body>

	<h1>회원가입 페이지</h1>
	
	<form action="${pageContext.request.contextPath}/signOk" method="post">
		<table>
			<tr>
				<td>아이디</td>
				<td><input type="text" name="loginId"></td>
			</tr>
			<tr>
				<td>비밀번호</td>
				<td><input type="password" name="loginPw"></td>
			</tr>
			
		</table>
		<input type="submit" value="가입하기">
		<input type="reset" value="다시작성">
		<input type="button" value="취소하기" onclick="history.back();">
	</form>


</body>
</html>