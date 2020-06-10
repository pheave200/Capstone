.body-content {
    margin-top: 72px;
}

td, th {
    padding: 10px;
}

th {
    text-align: center;
}

td {
    vertical-align: top;
}

tr:nth-child(odd) {
    background-color: #e4e4e4;
}

.centeredTable {
    margin-left: auto;
    margin-right: auto;
}

table.job-listing {
    margin: 30px auto;
    border: 1px solid #e4e4e4;
    width: 80%;
}

table.job-listing td:first-child {
    font-weight: bold;
}

table.job-listing td:last-child {
    width: 80%;
}

label {
    margin-right: 15px;
}

.centered {
    text-align: center;
}

//Get the button:
mybutton = document.getElementById("myBtn");

// When the user scrolls down 20px from the top of the document, show the button
window.onscroll = function() {scrollFunction()};

function scrollFunction() {
  if (document.body.scrollTop > 20 || document.documentElement.scrollTop > 20) {
    mybutton.style.display = "block";
  } else {
    mybutton.style.display = "none";
  }
}

// When the user clicks on the button, scroll to the top of the document
function topFunction() {
  document.body.scrollTop = 0; // For Safari
  document.documentElement.scrollTop = 0; // For Chrome, Firefox, IE and Opera
}