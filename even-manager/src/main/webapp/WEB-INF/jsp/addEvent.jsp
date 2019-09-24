<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>   
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Event</title>

<style type="text/css">

.errorTest{
	color:#ff0000;


}

.errorBanner{

color:black;
border: 3px solid #ff0000;
background-color:#ffeeee;
margin:16px;

}


</style>
</head>
<body>
	<h1>Add Event</h1>
	
	
	
	<div>Enter Event</div>
	<form:form commandName="event" method="POST">
	
	<form:errors path="*" cssClass="errorBanner" element="div"></form:errors>
	
	<form:input path="eventName"/>
	<div>
		<button type="submit">Save</button>
	</div>
	</form:form>

</body>
</html>