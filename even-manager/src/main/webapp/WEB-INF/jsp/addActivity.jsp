<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
    <%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>Need to read <a href="?language=en">English</a>|*| <a href="?language=si">Sinhala</a></p>
	<h1>Create Activity</h1>

	<form:form commandName="activities">
		<div>	
			<div><label><spring:message code="activity.name"/></label>
			</div>
		</div>
		<div><form:input path="activityName"/>
		</div>
		
		<div> <button type="submit">Save</button> </div>
	
	</form:form>


</body>
</html>