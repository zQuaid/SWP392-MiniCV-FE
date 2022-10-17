/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


if(document.getElementById("gender").values=0){
    document.getElementById("gender").innerHTML = "Female";
}

function clicked(e)
{
    if(!confirm('Ban co chac muon xoa khong')) {
        e.preventDefault();
    }
}

function sal(){
    let newsal = prompt("Enter a new salary");
    if(newsal !==null){
        document.getElementById("newsalary").value = newsal;
    }
}