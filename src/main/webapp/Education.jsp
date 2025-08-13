<%
String adminlogin = (String) session.getAttribute("adminlogin");
if (adminlogin == null) {
    response.sendRedirect("adminlogin.jsp");
    return;
}
%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Education</title>
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
        text-align: center;
    }

    h1 {
        margin-bottom: 20px;
        color: #ffd700;
    }

    input, textarea {
        width: 100%;
        padding: 10px;
        margin: 8px 0;
        border: none;
        border-radius: 6px;
        background: #1e1e1e;
        color: #ffffff;
        font-size: 14px;
        outline: none;
        resize: none; /* Prevent resizing for cleaner UI */
    }

    input::placeholder,
    textarea::placeholder {
        color: #bbbbbb;
    }

    textarea {
        min-height: 80px;
    }

    .btn { 
        height: auto;
        padding: 15px 20px;
        background: #151515;
        color: #ffd700;
        font-weight: bold;
        border-radius: 20px;
        box-shadow: 0 6px 6px rgba(255, 215, 0, 0.2);
        transition: transform 0.3s ease, box-shadow 0.3s ease;
        border: transparent;
        cursor: pointer;
        margin-top: 10px;
        width: 100%;
    }

    .btn:hover { 
        transform: translateY(-5px);
        box-shadow: 0 10px 25px rgba(255, 215, 0, 0.3);
    }
</style>
</head>
<body>

<div class="container">
    <%@include file="msgPrint.jsp" %>
    <h1>Add Education</h1>
    <form action="AddEducation" method="post">
        <input type="text" name="year" placeholder="Enter year" required>
        <input type="text" name="title" placeholder="Enter title" required>
        <input type="text" name="subtitle" placeholder="Enter subtitle" required>
        <textarea name="desc" placeholder="Enter description" required></textarea>
        <button type="submit" class="btn">Submit</button>
    </form>
</div>

</body>
</html>
