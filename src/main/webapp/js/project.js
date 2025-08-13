/**
 * 
 */

const texts = ['Full Stack Developer', 'MERN Stack Developer', 'Java Developer', 'Problem Solver'];
     let textIndex = 0;
     let charIndex = 0;
     let isDeleting = false;
     const typewriterElement = document.getElementById('typewriter');

     function typeWriter() {
         const currentText = texts[textIndex];

         if (isDeleting) {
             typewriterElement.textContent = currentText.substring(0, charIndex - 1);
             charIndex--;
         } else {
             typewriterElement.textContent = currentText.substring(0, charIndex + 1);
             charIndex++;
         }

         let typeSpeed = 200;
         if (isDeleting) {
             typeSpeed /= 2;
         }

         if (!isDeleting && charIndex === currentText.length) {
             typeSpeed = 2000;
             isDeleting = true;
         } else if (isDeleting && charIndex === 0) {
             isDeleting = false;
             textIndex = (textIndex + 1) % texts.length;
             typeSpeed = 500;
         }

         setTimeout(typeWriter, typeSpeed);
     }

     // Start typewriter effect when page loads
     document.addEventListener('DOMContentLoaded', function () {
         setTimeout(typeWriter, 1000);
         animateSkills();
     });

     // Smooth scrolling function
     function scrollToSection(sectionId) {
         document.getElementById(sectionId).scrollIntoView({
             behavior: 'smooth'
         });
     }

     // Skills animation
     function animateSkills() {
         const skillItems = document.querySelectorAll('.skill-item');
         const observer = new IntersectionObserver((entries) => {
             entries.forEach(entry => {
                 if (entry.isIntersecting) {
                     const progressBar = entry.target.querySelector('.skill-progress');
                     if (progressBar) {
                         progressBar.style.animation = 'skillLoad 1.5s ease-in-out forwards';
                     }
                 }
             });
         });

         skillItems.forEach(item => {
             observer.observe(item);
         });
     }

     // Project carousel
 
 let currentSlide = 0;
 const slides = document.querySelectorAll('.project-slide');
 const totalSlides = slides.length;

 function moveCarousel(direction) {
     currentSlide += direction;

     if (currentSlide >= totalSlides) {
         currentSlide = 0;
     } else if (currentSlide < 0) {
         currentSlide = totalSlides - 1;
     }
     
     

     console.log("corusel called", currentSlide, totalSlides);
     const carousel = document.getElementById('carousel');
     carousel.style.transform = `translateX(-${currentSlide*100}%)`;
 }



     // Auto-advance carousel
    
     function animateTimeline() {
         const timelineItems = document.querySelectorAll('.timeline-item');

         timelineItems.forEach((item, index) => {
             const rect = item.getBoundingClientRect();
             const isVisible = rect.top < window.innerHeight && rect.bottom >= 0;

             if (isVisible) {
                 setTimeout(() => {
                     item.style.animationDelay = `${index * 0.2}s`;
                     item.classList.add('animate');
                 }, index * 200);
             }
         });
     }

     // Scroll event listener
     window.addEventListener('scroll', animateTimeline);

     // Initial check for timeline animation
     document.addEventListener('DOMContentLoaded', animateTimeline);