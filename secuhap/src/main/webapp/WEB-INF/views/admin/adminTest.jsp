<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html ng-app>

<head>
	<meta charset="utf-8">
	<title>Angular Test</title>

</head>
	
	<table ng-controller="PhoneListController">
	
		<tr>
			<th>아이디</th>
			<th>비밀번호</th>
			<th>승인여부</th>
		</tr>
	
	
		<c:forEach items="${userList}" var="userdto">
	
	<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.0.2/angular.min.js">
	</script>
	<script type="text/javascript" charset="utf-8">

		function PhoneListController($scope) {
			$scope.phones[] = [{
					"name": "${userdto.loginId}",
					"snippet": "${userdto.loginPw}"
      			}];
  			
		}
		
	</script>
	
		<tr ng-repeat="phone in phones">
			<%-- 
			<td>${userdto.loginId}</td>
			<td>${userdto.loginPw}</td>
			<td>${userdto.checkId}</td>
			--%>
			<td>{{phone.name}}</td>
			<td>ㅋㅋㅋㅋㅋ</td>
			<td>헬로우</td>
		</tr>
		
		
	
	<!-- <ul ng-controller="PhoneListController">
		
		<li ng-repeat="phone in phones">
			이름 : {{phone.name}}<br />
			패스워드 : {{phone.snippet}}
		</li>
	</ul> -->
	
	
		</c:forEach>
	</table>
	<input type="button" value="전체승인" onclick="location.href='/web/checkOk';">
	<input type="button" value="전체거절" onclick="location.href='/web/checkNo';">
	

</html>