<%-- 
    Document   : Hello
    Created on : Sep 3, 2024, 9:47:23 PM
    Author     : PC
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String name = (String)request.getAttribute("t");
        %>
        
        <h1>C1: Hello <%= name %> </h1>
        
        <h1>C2: Hello ${requestScope.t}  </h1>
    </body>

</html>

