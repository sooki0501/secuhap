<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<c:if test="${result==1}">
		
		<script>
		window.onload = function() {
			alert("가입완료");
			location.href="${pageContext.request.contextPath}/sign";
		}
		</script>
		
	</c:if>
	<c:if test="${result==0}">
		<script>
		window.onload = function() {
			alert("노가입");			
			history.back;
		}
		</script>
	</c:if>

