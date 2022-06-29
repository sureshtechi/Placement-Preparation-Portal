var company_crud = document.getElementById("company_crud");
var wel = document.getElementById("wel");

function togglePopup_comp_crud()
{
    wel.style.display="none";
    company_crud.style.display = "none";
    if(company_crud.style.display == "none")
    {
        company_crud.style.display = "block";    
    }
}

function display_home()
{
    wel.style.display="none";
    company_crud.style.display = "none";
    if(wel.style.display == "none")
    {
        wel.style.display = "block";    
    }
}


