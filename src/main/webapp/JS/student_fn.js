var m_content=document.getElementById("m_content");
var wel=document.getElementById("wel");
var head=document.getElementById("head");
var content=document.getElementById("content");
var display_course = document.getElementById("display_course");
var display_assess = document.getElementById("display_assess");
var display_company = document.getElementById("display_company");
var display_graph = document.getElementById("display_graph");

//Navigation buttons
var mat=document.getElementById("mat");
var assess=document.getElementById("assess");
var comp=document.getElementById("comp");
var perform=document.getElementById("perform");
var prof=document.getElementById("prof");

var pop1=document.getElementById("popup-1");
var pop2=document.getElementById("popup-2");
var pop3=document.getElementById("popup-3");
var pop4=document.getElementById("popup-4");
var pop5=document.getElementById("popup-5");


function display_home(){
    wel.style.display="block";
    pop1.classList.remove("active");
    pop2.classList.remove("active");
    pop3.classList.remove("active");
    pop4.classList.remove("active");
    pop5.classList.remove("active");
    display_course.style.display = "none";
    display_assess.style.display = "none";
    display_company.style.display = "none";
    display_graph.style.display = "none";
}


function togglePopup_course(){
    pop1.classList.toggle("active");

    pop2.classList.remove("active");
    pop3.classList.remove("active");
    pop4.classList.remove("active");
    pop5.classList.remove("active");
}

function togglePopup_assess(){
    pop2.classList.toggle("active");

    pop1.classList.remove("active");
    pop3.classList.remove("active");
    pop4.classList.remove("active");
    pop5.classList.remove("active");
}

function togglePopup_comp(){
    pop3.classList.toggle("active");

    pop2.classList.remove("active");
    pop1.classList.remove("active");
    pop4.classList.remove("active");
    pop5.classList.remove("active");
}

function togglePopup_perform(){
    pop4.classList.toggle("active");

    pop2.classList.remove("active");
    pop3.classList.remove("active");
    pop1.classList.remove("active");
    pop5.classList.remove("active");
}


function togglePopup_prof(){
    pop5.classList.toggle("active");

    pop2.classList.remove("active");
    pop3.classList.remove("active");
    pop1.classList.remove("active");
    pop4.classList.remove("active");
}

function render_course(){
    wel.style.display="none";
    pop1.classList.remove("active");
    display_assess.style.display = "none";
    display_company.style.display = "none";
    display_graph.style.display = "none";
    if(display_course.style.display == "none")
    {
        display_course.style.display = "block";    
    }

}

function render_assess(){
    wel.style.display="none";
    pop2.classList.remove("active");
    display_course.style.display = "none";
    display_company.style.display = "none";
    display_graph.style.display = "none";
    if(display_assess.style.display == "none")
    {
        display_assess.style.display = "block";    
    }

}

function render_company(){
    wel.style.display="none";
    pop3.classList.remove("active");
    display_course.style.display = "none";
    display_assess.style.display = "none";
    display_graph.style.display = "none";
    if(display_company.style.display == "none")
    {
        display_company.style.display = "block";    
    }

}

function render_graph(){
    wel.style.display="none";
    pop4.classList.remove("active");
    display_course.style.display = "none";
    display_assess.style.display = "none";
    display_company.style.display = "none";
    if(display_graph.style.display == "none")
    {
        display_graph.style.display = "block";    
    }

}


