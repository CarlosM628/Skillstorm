

document.addEventListener("DOMContentLoaded", function() {
    const thumbnails = document.querySelectorAll('.thumbnail');
    const mainImage = document.getElementById('mainImage');
    

    thumbnails.forEach(thumbnail => {
      thumbnail.addEventListener('click', function() {
       
        mainImage.src = thumbnail.src;
        mainImage.alt = thumbnail.alt;
        
        document.getElementById('productDescription').textContent = "Product Description: " + thumbnail.alt;
      });
    });
  });

