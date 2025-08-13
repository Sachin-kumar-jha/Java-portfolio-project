<%
    String msg = (String) session.getAttribute("msg");
    if (msg != null) {
%>
<script>
    window.onload = function() {
        // Create the popup container
        let popup = document.createElement("div");
        popup.innerText = "<%= msg %>";
        
        // Styling for popup
        popup.style.position = "fixed";
        popup.style.top = "20px";
        popup.style.right = "20px";
        popup.style.border="transparent";
        popup.style.backgroundColor = "#151515"; // Green for success
        popup.style.color = "#ffd700";
        popup.style.padding = "10px 20px";
        popup.style.borderRadius = "8px";
        popup.style.boxShadow = "0 6px 6px rgba(255, 215, 0, 0.2)";
        popup.style.zIndex = "9999";
        popup.style.fontFamily = "Arial, sans-serif";
        popup.style.fontSize = "16px";
        popup.style.fontWeight="bold";
        popup.style.opacity = "1";
        popup.style.transition = "transform 0.3s ease";

        document.body.appendChild(popup);

        // Remove popup after 2 seconds
        setTimeout(() => {
            popup.style.opacity = "0";
            setTimeout(() => popup.remove(), 500); // Wait for fade-out
        }, 2000);
    };
</script>
<%
        session.removeAttribute("msg");
    }
%>
