<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Login</title>
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

.login-container {
	background: #141414; /* slightly lighter than background */
	padding: 30px;
	border-radius: 8px;
	box-shadow: 0 4px 12px rgba(0, 0, 0, 0.5);
	width: 300px;
	text-align: center;
}

h1 {
	margin-bottom: 20px;
	color: #ffd700;
}

input {
	width: 100%;
	padding: 10px;
	margin: 8px 0;
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

button {
	padding: 10px 20px;
	width: 100%;
	margin-top: 10px;
	border-radius: 6px;
	background: #151515;
	letter-spacing:2px;
	color: #ffd700;
	font-weight: bold;
	border-radius: 20px;
	box-shadow: 0 2px 6px rgba(255, 215, 0, 0.2);
	transition: transform 0.3s ease;
	border: transparent;
	cursor: pointer;
	font-size: 14px;
}

button:hover {
	background-color: #1e1e1e;
	transform: translateY(-10px);
}
</style>
</head>
<body>

<div class="login-container">
    <%@ include file="msgPrint.jsp" %>
    <h1>Admin Login</h1>
    <form action="AdminLogin1" method="post">
        <input name="username" type="text" placeholder="Enter your username" required />
        <input name="password" type="password" placeholder="Enter password" required />
        <button type="submit">Login</button>
    </form>
</div>

</body>
</html>
