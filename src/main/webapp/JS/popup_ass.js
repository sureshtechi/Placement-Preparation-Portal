function togglePopup(){
  document.getElementById("popup-1").classList.toggle("active");

  var pop=document.getElementById("pop_window");
  pop.innerHTML+=
  '<div class="popup" id="popup-1">'
  '<div class="overlay"></div>'
  '<div class="content">'
   ' <div class="close-btn" onclick="togglePopup()">×</div>'
    '<h1>Title</h1>'
   ' <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Illo aspernatur laborum rem sed laudantium excepturi veritatis voluptatum architecto, dolore quaerat totam officiis nisi animi accusantium alias inventore nulla atque debitis.</p>'
   '</div>'
'</div>'

}