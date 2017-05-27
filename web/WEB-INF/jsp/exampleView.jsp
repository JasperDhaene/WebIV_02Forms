<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Example</title>
    </head>
    <body>
        EL:<br>
        ${account.balance}<br>
        ${account.percent}<br><br>
        Spring:<br> 
        <!--
        <spring:bind path="account.balance">${status.value}</spring:bind>
        <br>
        <spring:bind path="account.percent">${status.value}</spring:bind>
        -->
        <br><br> 
                
        JSTL:<br>
        <!--
        <fmt:formatNumber value="${account.balance2}" pattern = "#,##0.00"/>
        <br>
        <fmt:formatNumber value="${account.percent2}" type="percent"/>
         -->
        </body>
</html>