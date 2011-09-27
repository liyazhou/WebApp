<!DOCTYPE HTML>
<html>
    <head>
        <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <link rel="stylesheet" href="css/main.css" type="text/css"/>
        <link rel="stylesheet" href="css/style.css" type="text/css"/>
        <title>User Login</title>
    </head>
    <body>

    <div id="header">
        <div class="wrap">
            <h1 id="logo">
                <a href="#">ABC Corp, Inc.</a>
            </h1>
        </div>
    </div>

    <div id="loginForm">
        <form method="POST" action="/login.tm">
            Sign In
            <br/>
            <label for ="username">Username</label><br/>
            <input type="text" id="username" name="username" width="20"/><br/>

            <label for="password">Password</label><br/>
            <input type="password" id="password" name="password" width="50"/><br/>

            <input type="submit" value="Sign in"/>
        </form>
    </div>

    </body>
</html>