<%
String adminlogin = (String) session.getAttribute("adminlogin");
if (adminlogin == null) {
    response.sendRedirect("adminlogin.jsp");
    return;
}
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="prg.sachin.model.ReadAdminPojo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Change Credential</title>
<style>
    body {
        font-family: 'Arial', sans-serif;
        line-height: 1.6;
        color: #ffffff;
        background: #0a0a0a;
        overflow-x: hidden;
        display: flex;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
    }

    .container {
        background: #141414;
        padding: 30px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.5);
        width: 350px;
    }

    h1 {
        text-align: center;
        margin-bottom: 20px;
        color: #ffd700;
    }

    label {
        margin-top: 10px;
        display: block;
        font-weight: bold;
        font-size: 14px;
    }

    input {
        width: 100%;
        padding: 10px;
        margin-top: 5px;
        margin-bottom: 15px;
        border: none;
        border-radius: 6px;
        background: #1e1e1e;
        color: #ffffff;
        font-size: 14px;
        outline: none;
    }

    input::placeholder {
        color: #bbbbbb;
    }

     .download-btn {
        width:100%;
        height: auto;
        padding:14px 22px;
        background: #151515;
        color: #ffd700;
        font-weight: bold;
        letter-spacing:2px;
        border-radius: 8px;
        box-shadow: 0 6px 6px rgba(255, 215, 0, 0.2);
        transition: transform 0.3s ease;
        border: transparent;
        cursor: pointer;
        text-decoration: none;
        display: inline-block;
    }

    .download-btn:hover {
        transform: translateY(-5px);
        box-shadow: 0 10px 25px rgba(255, 215, 0, 0.3);
    }
</style>
</head>
<body>

<div class="container">
    <%@ include file="msgPrint.jsp" %>
    <h1>Change Credential</h1>
    <%
        ReadAdminPojo readAdmin = (ReadAdminPojo) session.getAttribute("adminloginData");
    %>
    <form action="ChangeCredential1" method="post">
        <label>Serial No</label>
        <input type="text" name="sn" value="<%=readAdmin.getSn()%>" readonly>

        <label>Name</label>
        <input type="text" name="username" value="<%=readAdmin.getUsername()%>">

        <label>Password</label>
        <input type="text" name="password" value="<%=readAdmin.getPassword()%>">

        <button class="download-btn" type="submit">Change Credential</button>
    </form>
</div>

</body>
</html>
