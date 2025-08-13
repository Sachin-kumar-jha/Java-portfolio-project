<%
String adminlogin = (String) session.getAttribute("adminlogin");
if(adminlogin==null){
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
<title>Upload Project</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #0a0a0a;
        color: white;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }

    .container {
        background: #1a1a1a;
        padding:25px;
        border-radius: 12px;
        box-shadow: 0 4px 10px rgba(0,0,0,0.5);
        width:400px;
        text-align: center;
    }

    .container h2 {
        margin-bottom: 20px;
        color: #ffd700;
        font-size: 20px;
        font-weight: bold;
    }

    /* Styled File Input */
    input[type="file"] {
        display: block;
        width: 100%;
        padding:6px;
        color: #fff;
        background: #151515;
        border: 1px solid rgba(255, 215, 0, 0.2);
        border-radius: 8px;
        cursor: pointer;
        font-size: 14px;
        margin-bottom: 15px;
    }

    input[type="file"]::file-selector-button {
        background: #222;
        color: #fff;
        font-weight: bold;
        border: none;
        padding: 8px 14px;
        border-radius: 20px;
        transition: transform 0.3s ease, box-shadow 0.3s ease;
        cursor: pointer;
    }

    input[type="file"]::file-selector-button:hover {
        transform: translateY(-3px);
        box-shadow: 0 6px 15px rgba(255, 215, 0, 0.3);
    }

    input[type="date"] {
        width: 100%;
        padding: 8px;
        border: 1px solid rgba(255, 215, 0, 0.2);
        border-radius: 8px;
        background: #151515;
        color: #fff;
        margin-bottom: 15px;
    }

/* Hide the default date picker icon */
input[type="date"]::-webkit-calendar-picker-indicator {
    opacity: 0;
    cursor: pointer;
}

/* Add a custom white calendar icon using a background image */
input[type="date"] {
    background: #151515 url('data:image/svg+xml;utf8,<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="white" viewBox="0 0 16 16"><path d="M3.5 0a.5.5 0 0 1 .5.5V1h8V.5a.5.5 0 0 1 1 0V1h1a2 2 0 0 1 2 2v11a2 2 0 0 1-2 2H2a2 2 0 0 1-2-2V3a2 2 0 0 1 2-2h1V.5a.5.5 0 0 1 .5-.5zM1 4v10a1 1 0 0 0 1 1h12a1 1 0 0 0 1-1V4H1z"/></svg>') 
    no-repeat right 10px center;
    background-size: 18px;
  /* Space for icon */
    border: 1px solid rgba(255, 215, 0, 0.2);
    border-radius: 8px;
    color: #fff;
}

input[type="date"]:focus {
    border-color: gold;
    box-shadow: 0 0 6px rgba(255, 215, 0, 0.5);
}

    /* Download-btn style for submit button only */
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
    }

    .download-btn:hover {
        transform: translateY(-5px);
        box-shadow: 0 10px 25px rgba(255, 215, 0, 0.3);
    }
</style>
</head>
<body>

<%@include file="msgPrint.jsp" %>

<div class="container">
    <h2>Upload Project</h2>
    <form action="UploadProject1" method="post" enctype="multipart/form-data">
        <input type="file" name="myfile">
        <input type="date" name="datetime">
        <button type="submit" class="download-btn">Upload</button>
    </form>
</div>

</body>
</html>
