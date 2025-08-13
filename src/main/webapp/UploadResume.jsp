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
<title>Upload Resume</title>
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
        padding:30px;
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



    input[type="file"] {
        display:block;
        width: 100%;
        padding: 8px 4px;

        border: 1px solid rgba(255, 215, 0, 0.3);
        border-radius:8px;
        background-color: #151515;
        color: #fff;
        cursor: pointer;
        margin-bottom:15px;
    }

    input[type="file"]::-webkit-file-upload-button {
        background: gold;
        color: #000;
        padding:6px 10px;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        font-weight: bold;
        transition: background 0.3s ease;
    }

    input[type="file"]::-webkit-file-upload-button:hover {
        background: #ffd700;
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

<%@include file="msgPrint.jsp" %>
<div class="container">
<h2>Upload Project</h2>
<form action="UploadResume" method="post" enctype="multipart/form-data">
    <input type="file" name="myresume">
    <button class="download-btn">Upload</button>
</form>
</div>

</body>
</html>
