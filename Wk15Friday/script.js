
let images = document.querySelectorAll(".options img");


let targetElement = document.getElementById("product-image");

document.addEventListener("DOMContentLoaded", function() {
    const thumbnails = document.querySelectorAll('.thumbnail');
    const mainImage = document.getElementById('mainImage');
  
    thumbnails.forEach(thumbnail => {
      thumbnail.addEventListener('click', function() {
       
        mainImage.src = thumbnail.src;
        mainImage.alt = thumbnail.alt;
      });
    });
  });

