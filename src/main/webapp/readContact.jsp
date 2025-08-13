<%
String adminlogin = (String) session.getAttribute("adminlogin");
if(adminlogin == null){
    response.sendRedirect("adminlogin.jsp");
    return;
}
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="prg.sachin.model.ReadContentPojo" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Messages</title>
<style>
    body {
        font-family: 'Arial', sans-serif;
        line-height: 1.6;
        color: #ffffff;
        background: #0a0a0a;
        margin: 0;
        padding: 20px;
    }

    /* Grid container for cards */
    .card-container {
        display: grid;
        grid-template-columns: repeat(auto-fill, minmax(250px, 1fr));
        gap: 20px;
    }

    /* Individual card styling */
    .card {
        background: #151515;
        border-radius: 20px;
        padding: 20px;
        box-shadow: 0 6px 20px rgba(255, 215, 0, 0.1);
        border: 1px solid rgba(255, 215, 0, 0.2);
        transition: transform 0.3s ease, box-shadow 0.3s ease;
    }

    .card:hover {
        transform: translateY(-5px);
        box-shadow: 0 10px 25px rgba(255, 215, 0, 0.2);
    }

    .card p {
        margin: 6px 0;
        color:#fff;
    }

    /* Button style from your .download-btn */
    .download-btn {
        height: auto;
        padding: 10px 18px;
        background: #151515;
        color: #ffd700;
        font-weight: bold;
        border-radius: 20px;
        box-shadow: 0 6px 6px rgba(255, 215, 0, 0.2);
        transition: transform 0.3s ease;
        border: transparent;
        cursor: pointer;
        text-decoration: none;
        display: inline-block;
        margin-top: 10px;
    }

    .download-btn:hover {
        transform: translateY(-5px);
        box-shadow: 0 10px 25px rgba(255, 215, 0, 0.3);
    }

    /* Button container inside cards */
    .card-buttons {
        display: flex;
        gap: 10px;
        flex-wrap: wrap;
        margin-top: 10px;
    }
</style>
</head>
<body>

<%@include file="msgPrint.jsp" %>

<div class="card-container">
<%
ArrayList<ReadContentPojo> list = (ArrayList<ReadContentPojo>) session.getAttribute("readContact");

if (list != null && !list.isEmpty()) {
    for (ReadContentPojo read : list) {
%>
    <div class="card">
        <p><strong>SN:</strong> <%= read.getEid() %></p>
        <p><strong>Name:</strong> <%= read.getName() %></p>
        <p><strong>Email:</strong> <%= read.getEmail() %></p>
        <p><strong>Message:</strong> <%= read.getMessage() %></p>
        <div class="card-buttons">
            <a class="download-btn" href="Delete?eid=<%=read.getEid()%>">Delete</a>
        </div>
    </div>
<%
    }
} else {
%>
    <p>No messages found.</p>
<%
}
%>
</div>

<div style="margin-top: 20px; display:flex; justify-content:center; gap:5px">
    <a class="download-btn" href="admin.jsp">Go to admin</a>
</div>

</body>
</html>
