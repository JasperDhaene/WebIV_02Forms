<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix = "form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <spring:url value="/css/style.css" var="urlCss"/>
        <link rel="stylesheet" href="${urlCss}" type="text/css" /> 
        <title>Example Spring Web Flow</title>
    </head>
    <body>
        <h1>Example Spring Web Flow</h1>

        <form:form method="POST" action="account.htm" modelAttribute="account">

                <p><label>Balance (Spring):</label>
                    <form:input path="balance" size = "20"/>&nbsp;
                </p>
                <p class="note">Note: Door de NumberFormat annotatie wordt dit meteen geformateerd weergegeven en zal dus ook in deze vorm gesubmit worden.<br>
                    Om beter het verschil tussen EL, Spring en JSTL te zien op de volgende pagina, verander bovenstaande terug in originele 20003000.2599
                </p>
                <p>
                    <label>Percent (Spring):</label>
                    <form:input path="percent" size = "20"/>&nbsp;
                </p>

                <p>
                    <label>Email:</label>
                    <form:input path="email" size = "20"/>&nbsp;
                </p>

                <p>
                    <input type="submit" value="OK" />            
                </p>
            
        </form:form>

    </body>
</html>