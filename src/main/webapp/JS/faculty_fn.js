var m_content=document.getElementById("m_content");
var head=document.getElementById("head");
var content=document.getElementById("content");


//Navigation buttons
var assess=document.getElementById("assess");
var batch=document.getElementById("batch");
var perform=document.getElementById("perform");
var prof=document.getElementById("addfile");
var prof=document.getElementById("prof");

var pop1=document.getElementById("popup-1");
var pop2=document.getElementById("popup-2");
var pop3=document.getElementById("popup-3");
var pop4=document.getElementById("popup-4");
var pop4=document.getElementById("popup-5");


function togglePopup(){
    pop1.classList.toggle("active");

    pop2.classList.remove("active");
    pop3.classList.remove("active");
    pop4.classList.remove("active");
}

function togglePopup_batch(){
    pop2.classList.toggle("active");

    pop1.classList.remove("active");
    pop3.classList.remove("active");
    pop4.classList.remove("active");
}

function togglePopup_perform(){
    pop3.classList.toggle("active");

    pop2.classList.remove("active");
    pop1.classList.remove("active");
    pop4.classList.remove("active");
}

function togglePopup_prof(){
    pop4.classList.toggle("active");

    pop2.classList.remove("active");
    pop3.classList.remove("active");
    pop1.classList.remove("active");
}


