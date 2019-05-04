<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.*, java.sql.DriverManager ,java.sql.* ,java.text.*"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%  
		String fldate = request.getParameter("fdate");
		String url = "jdbc:mysql://localhost:3306/flight";
		String user = "root";
		String password = "msrit";
		Connection connection = null;
		Statement stmt;
		try 
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			out.println("hi, Flight details=");
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) 
			{
				stmt = connection.createStatement();
				String query = " select * from Flight where Weekdays='"
						+ fldate + "'";
				ResultSet re = stmt.executeQuery(query);
				while (re.next()) 
				{
					out.println(re.getString("Flight_Number") + "\n"
							+ re.getString("Airline_Name") + "\n"
							+ re.getString("Weekdays") + "\n");
				}
			} 
			else
				out.println("Connection refused");
		} 
		catch (Exception e) 
		{
			out.println(e.getMessage());
		}
	%>
</body>
</html>