<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Error</title>
<style>
    /* Dark theme base */
    body {
        background-color: #0a0a0a;
        color: #ffffff;
        font-family: 'Arial', sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        flex-direction: column;
        text-align: center;
    }

    h1 {
        font-size: 3rem;
        margin-bottom: 1rem;
         color: #ffd500;
        /* Add shadow to text */
        text-shadow: 2px 2px 5px rgba(255, 85, 85, 0.7);
    }

    p {
        font-size: 1.2rem;
        color: #cccccc;
    }

    /* Using download-btn style */
     .download-btn-div {
            display: flex;
            justify-content: start;
            margin-top: 20px;
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
        }

        .download-btn:hover {
            transform: translateY(-10px);
            box-shadow: 0 10px 25px rgba(255, 215, 0, 0.3);
        }
	
</style>
</head>
<body>
    <h1>ERROR PAGE</h1>
    <p>Oops! Something went wrong.</p>
       <div class="download-btn-div">
                    <a href="index.jsp"><button class="download-btn">Go to Home</button></a>
                        
      </div>
</body>
</html>
