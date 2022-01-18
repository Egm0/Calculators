<%-- 
    Document   : ArithmeticCalculator
    Created on : Jan. 17, 2022, 12:25:42 p.m.
    Author     : earlg
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form action="calc" method="post">
            <label for="num1">First Number</label>
            <input type="number" id="num1" name="num1">
            <br>

            <label for="num2">Second Number</label>
            <input type="number" id="num2" name="num2">
            <br>
            
            <input type="submit" value="+" name="submitButton">
            <input type="submit" value="-" name="submitButton">
            <input type="submit" value="x" name="submitButton">
            <input type="submit" value="%" name="submitButton">
        </form>
        
        
        <p>${message}</p>
        
        
        <a href="http://localhost:8080/Calculators/age">Age Calculator Here!</a>
    </body>
</html>
