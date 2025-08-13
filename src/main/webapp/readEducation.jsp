

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList" %>
<%@page import="prg.sachin.model.ReadEducationPojo" %>

<%@ page import="prg.sachin.dao.AddEducationDaoImpl" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Education Records</title>
<style>
    body {
        font-family: 'Arial', sans-serif;
        line-height: 1.6;
        color: #ffffff;
        background: #0a0a0a;
        overflow-x: hidden;
        padding: 20px;
        margin: 0;
    }

    .record {
        background: #141414;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0,0,0,0.5);
        margin-bottom: 20px;
    }

    strong {
        color: #ffd700;
    }

    .btn { 
        display: inline-block;
        padding: 10px 20px;
        background: #151515;
        color: #ffd700;
        font-weight: bold;
        border-radius: 20px;
        box-shadow: 0 6px 6px rgba(255, 215, 0, 0.2);
        transition: transform 0.3s ease, box-shadow 0.3s ease;
        border: none;
        cursor: pointer;
        text-decoration: none;
    }

    .btn:hover { 
        transform: translateY(-3px);
        box-shadow: 0 10px 25px rgba(255, 215, 0, 0.3);
    }

    .btn-danger {
        background: #b30000;
        color: #fff;
        box-shadow: 0 6px 6px rgba(255, 0, 0, 0.2);
    }

    .btn-danger:hover {
        background: #e60000;
        box-shadow: 0 10px 25px rgba(255, 0, 0, 0.3);
    }

    .refresh-container {
        text-align: center;
        margin-top: 20px;
    }
</style>
</head>
<body>

<%@include file="msgPrint.jsp" %>

<%
  ArrayList<ReadEducationPojo> list =new AddEducationDaoImpl().readEducation();

  if (list != null && !list.isEmpty()) {
      for (ReadEducationPojo read : list) {
%>
<div class="record">
    <p><strong>ID:</strong> <%= read.getId() %></p>
    <p><strong>Year:</strong> <%= read.getYear() %></p>
    <p><strong>Title:</strong> <%= read.getTitle() %></p>
    <p><strong>Subtitle:</strong> <%= read.getSubtitle() %></p>
    <p><strong>Description:</strong> <%= read.getDesc() %></p>
    <p><strong>Created At:</strong> <%= read.getTime() %></p>
    <a href="DeleteEducation?id=<%=read.getId()%>" class="btn btn-danger">Delete</a>
</div>
<% 
      }
  } else {
%>
<p>No education records found.</p>
<% } %>

<div class="refresh-container">
    <a href="admin.jsp" class="btn">Go to Admin</a>
</div>

</body>
</html>
