<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% int i= Integer.parseInt (request.getParameter("count"));
	
	for(int k=0;k<i;k++){
	
	%>

	<h1><%=request.getParameter("textfield") %></h1>
	
	<%} %>
</body>
</html>