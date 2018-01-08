<%-- 
    Document   : displaytCustomerDetails
    Created on : 28-Sep-2017, 14:57:25
    Author     : I342042
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <link href="css/style.css" rel="stylesheet" type="text/css"/>
        <title>Customer Summary</title>
    </head>
    <body>
        <h1>Customer List</h1>
        <table>
            <thead>
                <tr>
                <td>Number</td><td>Name</td><td>City</td><td>Credit Limit</td>
                <td> Extra Details </td>
        </tr>
    </thead>
    <tbody>
    <c:forEach var="cust" items="${customers}">
        <tr>
            <td>${cust.customerNumber}</td><td>${cust.customerName}</td><td>${cust.city}</td>
            <td>${cust.cred}</td><td>
    <div>
        <form method="post" action="displayCustomerDetails.jsp">
            <input type="hidden" name="id" value="$(cust.customerNumber)"/>
            <input type="submit" value="Details"/>
        </form>
    </div>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
        
</body>
</html>