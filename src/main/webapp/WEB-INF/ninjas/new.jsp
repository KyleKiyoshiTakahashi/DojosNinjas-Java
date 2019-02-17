<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>New Ninjas</title>
</head>
<body>

<h1>New Ninja</h1>

<form:form action="/ninjas" method="POST" modelAttribute="ninja">
   
	<form:select path="dojo">
		<c:forEach items="${allDojos}" var="d">
     		<form:option value="${d.id}" label="${d.name}"/> 
		</c:forEach>
	</form:select>
			
    
    <form:label path="firstName">First Name: </form:label>
        <form:errors path="firstName"/>
    <form:input path="firstName"/>
     
     <form:label path="lastName">Last Name: </form:label>
        <form:errors path="lastName"/>
    <form:input path="lastName"/>
    
    <form:label path="age">Age: </form:label>
        <form:errors path="age"/>
    <form:input path="age"/>
    
     
    <input type="submit" value="Create"/>
</form:form> 

</body>
</html>