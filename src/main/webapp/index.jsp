<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="prg.sachin.dao.UploadProjectDaoImpl" %>
<%@ page import="prg.sachin.dao.AddEducationDaoImpl" %>
<%@ page import="prg.sachin.model.UploadPojo" %>
<%@page import="prg.sachin.model.ReadEducationPojo" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>My Portfolio</title>
    <link rel="stylesheet" href="style.css">
 
</head>
<body>
    <!-- Navigation -->
 
    <div class="nav">
        <nav>
            <ul>
                <li><a onclick="scrollToSection('home')">Home</a></li>
                <li><a onclick="scrollToSection('education')">Education</a></li>
                <li><a onclick="scrollToSection('skills')">Skills</a></li>
                <li><a onclick="scrollToSection('projects')">Projects</a></li>
                <li><a onclick="scrollToSection('contact')">Contact</a></li>
            </ul>
        </nav>
    </div>


    <!-- Landing Page -->
    <section id="home">
        <div class="container">
        <%@include file="msgPrint.jsp" %>
            <div class="home-content">
                <div class="text-column">
                    <h1>Hi, I'm Sachin Jha</h1>
                    <div class="animated-text">
                        <span class="typewriter" id="typewriter"></span>
                    </div>
                    <p class="description">
                        I'm a passionate developer who loves creating innovative solutions
                        and bringing ideas to life through code. Welcome to my portfolio!
                    </p>
                    <div class="download-btn-div">
                    <a href="DownloadResume"><button class="download-btn">Download Resume</button></a>
                        
                    </div>
                </div>
                <div class="image-column">
                    <img src="data:image/svg+xml,%3Csvg xmlns='http://www.w3.org/2000/svg' viewBox='0 0 400 400'%3E%3Cdefs%3E%3ClinearGradient id='bg' x1='0%25' y1='0%25' x2='100%25' y2='100%25'%3E%3Cstop offset='0%25' style='stop-color:%23000000'/%3E%3Cstop offset='100%25' style='stop-color:%23333333'/%3E%3C/linearGradient%3E%3C/defs%3E%3Crect width='400' height='400' fill='url(%23bg)'/%3E%3C!-- Desk --%3E%3Crect x='50' y='250' width='300' height='20' fill='%23444444'/%3E%3Crect x='40' y='270' width='20' height='80' fill='%23333333'/%3E%3Crect x='340' y='270' width='20' height='80' fill='%23333333'/%3E%3C!-- Monitor --%3E%3Crect x='120' y='180' width='160' height='100' fill='%23222222' rx='8'/%3E%3Crect x='130' y='190' width='140' height='80' fill='%23000000'/%3E%3Crect x='190' y='280' width='20' height='30' fill='%23333333'/%3E%3Crect x='170' y='310' width='60' height='10' fill='%23444444' rx='5'/%3E%3C!-- Person --%3E%3Ccircle cx='200' cy='150' r='25' fill='%23fdbcb4'/%3E%3Crect x='185' y='175' width='30' height='40' fill='%23ffffff' rx='5'/%3E%3Crect x='175' y='185' width='15' height='30' fill='%23fdbcb4' rx='7'/%3E%3Crect x='210' y='185' width='15' height='30' fill='%23fdbcb4' rx='7'/%3E%3Crect x='190' y='215' width='10' height='25' fill='%23333333'/%3E%3Crect x='200' y='215' width='10' height='25' fill='%23333333'/%3E%3C!-- Screen content --%3E%3Crect x='135' y='195' width='130' height='3' fill='%23ffd700'/%3E%3Crect x='135' y='205' width='100' fill='%23ffd700' height='3'/%3E%3Crect x='135' y='215' width='120' height='3' fill='%23ffd700'/%3E%3Crect x='135' y='225' width='80' height='3' fill='%23ffd700'/%3E%3C/svg%3E"
                        alt="Developer working on desktop" class="developer-image">
                </div>
            </div>
        </div>
    </section>

    <!-- Education Section -->
    <section id="education">
        <div class="container">
            <h2 class="education-title">Education</h2>
            <div class="timeline">
            
 <%
  ArrayList<ReadEducationPojo> arrlist =new AddEducationDaoImpl().readEducation();
      for (ReadEducationPojo read : arrlist) {
%>
<div class="timeline-item">
<div class="timeline-content">
                        <div class="timeline-year"><%= read.getYear() %></div>
                        <h3 class="timeline-title"><%= read.getTitle() %></h3>
                        <div class="timeline-subtitle"><%= read.getSubtitle() %></div>
                        <p><%= read.getDesc() %></p>
                    </div>
                    
                    
    </div>
<% }%>
    </section>

    <!-- Skills Section -->
    <section id="skills">
        <div class="container">
            <h2 class="skills-title">Technical Skills</h2>
            <div class="skills-container">
                <div class="skill-category">
                    <h3><span class="skill-icon">M</span>MERN Stack</h3>
                    <div class="skills-grid">
                        <div class="skill-item">
                            <div class="skill-name">MongoDB</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 85%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">Express.js</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 90%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">React.js</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 95%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">Node.js</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 88%;"></div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="skill-category">
                    <h3><span class="skill-icon">☕</span>Java Development</h3>
                    <div class="skills-grid">
                        <div class="skill-item">
                            <div class="skill-name">Core Java</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 92%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">Spring Boot</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 85%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">Spring MVC</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 80%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">Hibernate</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 78%;"></div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="skill-category">
                    <h3><span class="skill-icon">🗄️</span>Database & Tools</h3>
                    <div class="skills-grid">
                        <div class="skill-item">
                            <div class="skill-name">MySQL</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 88%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">PostgreSQL</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 82%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">Git & GitHub</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 90%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">Docker</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 75%;"></div>
                            </div>
                        </div>
                    </div>
                </div>

                <div class="skill-category">
                    <h3><span class="skill-icon">🎨</span>Frontend Technologies</h3>
                    <div class="skills-grid">
                        <div class="skill-item">
                            <div class="skill-name">HTML5</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 95%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">CSS3</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 92%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">JavaScript</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 90%;"></div>
                            </div>
                        </div>
                        <div class="skill-item">
                            <div class="skill-name">TypeScript</div>
                            <div class="skill-level">
                                <div class="skill-progress" style="width: 85%;"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Projects Section -->
 <section id="projects">
    <div class="container">
        <h2 class="projects-title">My Projects</h2>
        <div class="carousel-container">
            <div class="carousel" id="carousel">
                <%
                    ArrayList<UploadPojo> list = new UploadProjectDaoImpl().readProject();
                    for (UploadPojo prj : list) {

                %>
                <div class="project-slide">
                   <div class="project-content">
                            <h3 class="project-title">E-Commerce Platform</h3>
                            <p class="project-description">
                                A full-featured e-commerce platform built with modern web technologies.
                                Includes user authentication, payment processing, inventory management,
                                and responsive design for seam shopping experience across all devices.
                            </p>
                            <div class="project-tech">
                                <span class="tech-tag">React</span>
                                <span class="tech-tag">Node.js</span>
                                <span class="tech-tag">MongoDB</span>
                                <span class="tech-tag">Stripe API</span>
                            </div>
                        </div>
                    <img src="myphoto/<%= prj.getForFilename() %>" alt="project-image" class="project-image" />
                </div>
                <% } %>
            </div>
            <button class="carousel-btn prev" id="prev" onclick="moveCarousel(-1)">❮</button> 
            <button class="carousel-btn next" id="next" onclick="moveCarousel(1)">❯</button>
        </div>
    </div>
</section>
    <!-- Contact Section -->
    <section id="contact">
        <div class="container">
            <h2 class="contact-title">Get In Touch</h2>
            <div class="contact-content">
                <div class="contact-info">
                    <h3>Contact Information</h3>
                    <div class="contact-item">
                        <div class="contact-icon">📧</div>
                        <div class="contact-details">
                            <h4>Email</h4>
                            <p>john.doe@example.com</p>
                        </div>
                    </div>
                    <div class="contact-item">
                        <div class="contact-icon">📱</div>
                        <div class="contact-details">
                            <h4>Phone</h4>
                            <p>+1 (555) 123-4567</p>
                        </div>
                    </div>
                    <div class="contact-item">
                        <div class="contact-icon">📍</div>
                        <div class="contact-details">
                            <h4>Location</h4>
                            <p>New York, NY, USA</p>
                        </div>
                    </div>
                    <div class="contact-item">
                        <div class="contact-icon">💼</div>
                        <div class="contact-details">
                            <h4>LinkedIn</h4>
                            <p>linkedin.com/in/johndoe</p>
                        </div>
                    </div>
           
                </div>
                <div class="contact-form">
                    <h3>Send Message</h3>
                    <form id="contactForm" action="ContactServlet1" method="post">
                        <div class="form-group">
                            <label for="username">Username</label>
                            <input type="text" id="username" name="username" placeholder="Enter your username" required>
                        </div>
                        <div class="form-group">
                            <label for="email">Email</label>
                            <input type="email" id="email" name="email" placeholder="Enter your email address" required>
                        </div>
                        <div class="form-group">
                            <label for="message">Message</label>
                            <textarea id="message" name="message"
                                placeholder="Tell me about your project or just say hello!" required></textarea>
                        </div>
                        <button type="submit" class="submit-btn">Send Message</button>
                    </form>
                </div>
            </div>
        </div>
    </section>

    <script src="js/project.js"> 
    </script>
</body>

</html>