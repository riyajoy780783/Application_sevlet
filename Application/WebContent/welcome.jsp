<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
	
	<%@page import="java.util.*" %>
	<%
    List abc=(List)request.getAttribute("data");
    %> 
	  
         <h3>Firstname :<%=" "+abc.get(0) %></h3>
         <h3>Lastname :<%=" "+abc.get(1) %></h3>
         <h3>Username :<%=" "+abc.get(2) %></h3>
         <h3>Password :<%=" "+abc.get(3) %></h3>
         <h3>Email :<%=" "+abc.get(4) %></h3>
         <h3>Mobile :<%=" "+abc.get(5) %></h3>
        
       
        <%-- <c:forEach var="list" items="${data}" >
	${data}
	</c:forEach>
         --%>
      
	
</body>
</html>