<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel='stylesheet'
	href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'
	integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u'
	crossorigin='anonymous'>
<title>Online Hosts...</title>
</head>
<body>

	<br>
	<br>


	<div class='container'>
		<div class='col-md-3 col-md-offset-4'>

			<form action=action= '/finalproject/InfoProcess.jsp' method='GET'>
				<%
					String[] s = request.getParameterValues("slct");
					String a = "CONNECT " + String.valueOf(s.length);
					
					for (int i = 0; i < s.length; i++) {
						a = a + " " + s[i];
					}
				%>
				<%=a%>



			</form>

		</div>
	</div>



</body>
</html>