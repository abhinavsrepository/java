<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.pojo.core.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Page</title>
</head>
<%! 
Map<String,User> users;
public void jspInit() {
    users = new HashMap<>();
    users.put("abc@gmail.com", new User("a", "abc123"));
    users.put("adc@gmail.com", new User("b", "adc123"));
    System.out.println("Initialized users");
}
%>
<body>
<%
String username = request.getParameter("em");
String password = request.getParameter("pass");

if(username != null && password != null) {
    User user = users.get(username);
    if(user != null) {
        if(user.getPassword().equals(password)) {
            session.setAttribute("user_detail", user);
            response.sendRedirect("details.jsp");
            return;
        } else {
%>
            <h5 style="color:red;">
            Invalid password, please retry <a href="login.jsp">Retry</a>
            </h5>
<%
        }
    } else {
%>
        <h5 style="color:red;">
        Email not found, please retry <a href="login.jsp">Retry</a>
        </h5>
<%
    }
}
%>
</body>
</html>
