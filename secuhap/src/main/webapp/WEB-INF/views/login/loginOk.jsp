<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<c:if test="${loginDTO.checkId == '0'}">
	<script>
		alert("승인 대기중인 회원입니다");
		history.go(-1);
	</script>
</c:if>

<c:if test="${loginDTO !=null}">
	<script>
		location.href="${pageContext.request.contextPath}/success";
	</script>
</c:if>

<c:if test="${loginDTO == null}">
	<script>
		alert("아이디나 비밀번호가 틀립니다!");
		history.go(-1);
	</script>
</c:if>




 
 
<%--   <c:choose>
  
   <c:when test="${checkId == '0'}">
 	<script>
		alert("승인 대기중인 회원입니다");
		history.go(-1);
	</script>
 </c:when>
 
 <c:when test="${loginDTO !=null}">
 	<script>
		location.href="${pageContext.request.contextPath}/success";
	</script>
 </c:when>
 
 <c:when test="${loginDTO == null}">
 	<script>
		alert("아이디나 비밀번호가 틀립니다!");
		history.go(-1);
	</script>
 </c:when> 

 </c:choose>--%>
 
