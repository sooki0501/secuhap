<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>		

	<c:if test="${UserDTO != null}">
  	<script>
  	location.href="${pageContext.request.contextPath }/board";
  	alert(UserDTO.userId());
	</script>  
	</c:if>
	<c:if test="${UserDTO==null}">
	<script>
  	location.href="${pageContext.request.contextPath }/login";
	</script>
	</c:if>
	