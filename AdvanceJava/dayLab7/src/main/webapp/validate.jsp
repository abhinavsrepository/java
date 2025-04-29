<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="com.pojo.core.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<%! 
Map<String,User> users;
public void jspInit()
{
	//create empty hashmap n populate it with users
	users= new HashMap<>();
	users.put("abc@gmail.com",new User("a","abc123"));
	users.put("adc@gmail.com",new User("b","adc123"));
	
	System.out.println("initited000");
	
}

%>

<body>
<%
//read req params
String username= request.getParameter("em");
String password= request.getParameter("pass");
//get user by email
User user = users.get(email);
if(user!=null)
{
	if (user.getPassword().equals(password))
	{
		
		//valid login  asve user details under session scop
		
		session.setAttribute("user_detail",user);
		
		response.sendRedirect("details.jsp");
		
	}
	else{

%>
<h5 style="color:red;">
invalid email please retry <a href="login.jsp">Retry</a>
</h5>
		
	}
}

</body>
</html>