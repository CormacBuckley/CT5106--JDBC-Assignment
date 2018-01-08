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
        <title>Customer Details</title>
         <link href="css/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <table>

            <c:forEach var="cust" items="${customers}">
                <c:if test="${param.customerNumber==e.customerNumber}">
                    <h1>Customer Details: ${cust.customerName}</h1>
                    <tr><td>CONTACT</td><td>${cust.fName} ${cust.lName}</td>
                    </tr>
                    <tr><td>PHONE</td><td>${cust.phone}</td>
                    </tr>
                    <tr>
                        <td>ADDRESS</td><td>${cust.addressLine1}<br> ${cust.addressLine2} <br> ${cust.city} <br> ${cust.state} <br> ${cust.postalCode} <br> ${cust.country}</td>
                    </tr>
                </c:if>
            </c:forEach>
    </table>
                        
    </body>
</html>