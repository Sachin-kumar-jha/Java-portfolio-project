<%
String adminlogin = (String) session.getAttribute("adminlogin");
if (adminlogin == null) {
    response.sendRedirect("adminlogin.jsp");
    return;
}
%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="prg.sachin.dao.UploadProjectDaoImpl" %>
<%@ page import="prg.sachin.model.UploadPojo" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Dashboard</title>
<style>
    body {
        font-family: 'Arial', sans-serif;
        line-height: 1.6;
        color: #ffffff;
        background: #0a0a0a;
        margin: 0;
        padding: 0;
    }

    /* Navbar wrapper */
    .nav {
        display: flex;
        width: 100%;
        height: 69px;
        justify-content: center;
        align-items: center;
        position: fixed;
        padding: 10px;
        z-index: 10000;
        padding:10px;
        top: 0;
        left: 0;
        margin-top:10px;
    }

    /* Actual nav bar */
    nav {
        display: flex;
        justify-content: center;
        align-items: center;
        border-radius: 10px;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        width: 60%;
        border: transparent;
        background: transparent;
        box-shadow: 1px 3px 6px rgb(128, 128, 128);
        backdrop-filter: blur(10px);
        padding: 1rem 10px;
        border-bottom: 1px solid #000000;
    }
    nav ul {
        list-style: none;
        display: flex;
        justify-content: center;
        gap: 2rem;
        margin: 0;
        padding: 0;
    }

    nav a, nav button {
        display: block;
        color: #ffffff;
        text-decoration: none;
        font-weight: thin;
        letter-spacing: 1px;
        background: transparent;
        border: none;
        font-size: 14px;
        cursor: pointer;
        transition: transform 0.3s ease, color 0.3s ease;
    }

    nav a:hover, nav button:hover {
        color: #ffd700;
        transform: translateY(-10px);
    }

    /* Main content below navbar */
    .content {
        padding-top: 100px; /* space for fixed nav */
        text-align: center;
    }

    .project-container {
        display: flex;
        flex-wrap: wrap;
        justify-content: center;
        gap: 20px;
        padding: 20px;
    }

    .project-card {
        background: #141414;
        padding: 15px;
        border-radius: 8px;
        text-align: center;
        box-shadow: 0 2px 8px rgba(0,0,0,0.4);
        width: 150px;
    }

    .project-card img {
        object-fit: cover;
        height: 100px;
        width: 100px;
        border-radius: 4px;
    }

    .download-btn {
        height: auto;
        padding: 15px 20px;
        background: #151515;
        color: #ffd700;
        font-weight: bold;
        border-radius: 20px;
        box-shadow: 0 6px 6px rgba(255, 215, 0, 0.2);
        transition: transform 0.3s ease;
        border: transparent;
        cursor: pointer;
        margin-top: 10px;
    }

    .download-btn:hover {
        transform: translateY(-10px);
        box-shadow: 0 10px 25px rgba(255, 215, 0, 0.3);
    }
    
</style>
</head>
<body>

<div class="nav">
    <nav>
        <ul>
            <li><a href="ReadContent">Messsages</a></li>
            <li><a href="ReadEducation">Education</a></li>
            <li><a href="UploadProject.jsp">Adproject</a></li>
            <li><a href="UploadResume.jsp">Updateresume</a></li>
            <li><a href="Education.jsp">Addeducation</a></li>
            <li>
                <form action="AdminLogout" method="post" style="display:inline;">
                    <button type="submit">Logout</button>
                </form>
            </li>
            <li>
                <form action="ReadAdminlogin" method="post" style="display:inline;">
                    <button type="submit">Credential</button>
                </form>
            </li>
        </ul>
    </nav>
</div>

<div class="content">
    <%@ include file="msgPrint.jsp" %>
    <h1>Projects</h1>
    <div class="project-container">
    <%
        ArrayList<UploadPojo> list = new UploadProjectDaoImpl().readProject();
        for (UploadPojo prj : list) {
    %>
        <div class="project-card">
            <img src="myphoto/<%= prj.getForFilename() %>" alt="project-image" />
            <form action="DeleteProject" method="post">
                <input type="hidden" name="sn" value="<%= prj.getSn() %>">
                <input type="hidden" name="forFilename" value="<%= prj.getForFilename() %>">
                <button type="submit" class="download-btn">Delete</button>
            </form>
        </div>
    <% } %>
    </div>
</div>

</body>
</html>
