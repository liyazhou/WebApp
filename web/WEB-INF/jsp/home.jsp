<!DOCTYPE HTML>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
    <head>
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <title>Welcome Home!</title>
    </head>
    <body>

    <spring:message code="message.hello.name" arguments="${command.user}"/><br/>

    </body>
</html>