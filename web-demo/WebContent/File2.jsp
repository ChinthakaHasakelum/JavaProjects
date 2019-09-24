<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
	<body>
	
		<form action="File3.jsp">
	
			<label>Value2</label>
			<input type="text" name="value2">
			<input type="text" name="value1" hidden  value="<%=request.getParameter("value1") %>") >
			<button type="submit">Next</button>
			
			
	
		</form>
	</body>
</html>