<%-- 
    Document   : detalis
    Created on : 04 Mar 2022, 17:49:51
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Outcome</title>
    </head>
    <body>
       
    <center>
        <h1>Outcome</h1>
        <%
        String name = (String)request.getAttribute("firstName");
        String surname = (String)request.getAttribute("lastName");
        String email = (String)request.getAttribute("email");
        String DoB = (String)request.getAttribute("DoB");
        String outcome = (String)request.getAttribute("outcome");
        %>
        
        <p>
            Hello <%=surname%> <%=name%> <br><br>
            
            your email <%=email%><br><br><!-- comment -->
            
            your date of birth <%=DoB%> <br><br><!-- comment -->
            
            you have <%=outcome%> years old..(:<br><br>
            
            click <a href="index.html">here</a> to go to main page
           
        </p>
    </center>  
    </body>
</html>
