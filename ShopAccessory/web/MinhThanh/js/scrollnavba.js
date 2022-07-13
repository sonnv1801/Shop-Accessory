
// window.onscroll = function() {myFunction()};
window.onscroll = function() {
  myFunction();
  scrollFunction();
}

// window.addEventListener('scroll', myFunction());
// window.addEventListener('scroll', scrollFunction());

var navbar = document.getElementById("navbar");
var subnavbar = document.getElementById("subnavbar");

var sticky = navbar.offsetTop;

function myFunction() {
  if (window.pageYOffset >= sticky) {
    navbar.classList.add("sticky");
    subnavbar.style.width = "70px";
  } else {
    navbar.classList.remove("sticky");
    subnavbar.style.width = "100px";
  }
}