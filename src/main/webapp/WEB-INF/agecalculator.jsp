<%-- 
    Document   : agecalculator
    Created on : Jan. 14, 2022, 6:05:26 p.m.
    Author     : earlg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            <label for="age">Enter Your Age:</label>
            <input type="number" name="age" id="age" value="1" min="1">
            <button type="Submit">Submit</button>
            <a href="http://localhost:8080/Calculators/calc">Arithmetic Calculator Here!</a>
        </form>
        
        <p>${message}</p>
        
    </body>
</html>
