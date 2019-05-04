<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.* , java.text.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("<B><FONT COLOR = Blue>");
		out.println("Welcome </FONT></B>");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		//Date datess = new Date();
		out.println("<BR><FONT COLOR = Green>");
		//out.println("Today is </FONT>"+dateFormat.format(datess));
	%>
	<form action="ViewDetails.jsp" method="post">
		<FONT COLOR="Magenta"> Flight Number:</FONT> <input type="text"
			size="15" name="fname"> <br> <FONT COLOR="Brown">Date:
		</FONT> <input type="text" size="15" name="date"> <br> <FONT
			COLOR="Brown">Customer Name: </FONT> <input type="text" size="15"
			name="custname"> <br> <FONT COLOR="Brown">Customer
			Number: </FONT> <input type="text" size="15" name="custno"> <br>
		<input type="submit" value="Submit form">
	</form>
</body>
</html>