<%-- 
    Document   : Home
    Created on : Sep 3, 2024, 10:57:40 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <h1>${requestScope.success}</h1>
        <h1>${requestScope.error}</h1>
    </body>
</html>
