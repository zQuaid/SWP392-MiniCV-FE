


$(document).ready(function() { 
    	 
 $("#btnadd").click(function() {  

   $(".error").hide();
   var hasError = false;
   var regexEmail = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
   var regexName = /^[a-zA-Z]{1,20}$/;
   var regexPhone = /^[0-9]{0,11}$/;

   var firstname =  $("#firstname").val();
   var lastname = $("#lastname").val();
   var username = $("#username").val();
   var password = $("#password").val();
   var email = $("#email").val();
   var address = $("#address").val();
   var phone =  $("#phone").val();
   var dob = $("#dob").val();
   var salary = $("#salary").val();
  

   if(!regexName.test(firstname)) {
     $("#firstname").after('<span class="error">FirstName is incorrect format</span>');
     hasError = true;
   }else if(firstname == ""){
     $("#firstname").after('<span class="error">FirstName must not null</span>');
     hasError = true;
   }

    if(!regexName.test(lastname)) {
     $("#lastname").after('<span class="error">LastName is incorrect format</span>');
     hasError = true;
   }else if(lastname == ""){
     $("#firstname").after('<span class="error">LastName must not null</span>');
     hasError = true;
   }
   
   if(username == ""){
       $("#username").after('<span class="error">Username must not null</span>');
       hasError = true;
   }

    if(password == ""){
       $("#password").after('<span class="error">Password must not null</span>');
       hasError = true;
    }

   if(!regexEmail.test(email)) {
     $("#email").after('<span class="error">Email is incorrect format</span>');
     hasError = true;
   }else if(email == ""){
      $("#email").after('<span class="error">Email must not null</span>');
      hasError = true;
    }

    if(address == ""){
       $("#address").after('<span class="error">Address must not null</span>');
       hasError = true;
    }

   if(!regexPhone.test(phone)) {
     $("#phone").after('<span class="error">Phone is incorrect format</span>');
     hasError = true;
   }else if(phone == ""){
       $("#phone").after('<span class="error">Phone Must not null</span>');
     hasError = true;
   }

    if(dob == ""){
       $("#dob").after('<span class="error">Date of Birth must not null</span>');
       hasError = true;
    }
    
    if(salary == ""){
       $("#salary").after('<span class="error">Salary must not null</span>');
       hasError = true;
    }

   if(hasError == true) {return false;}
   else
       return true;
   });
   });