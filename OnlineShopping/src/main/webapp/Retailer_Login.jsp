<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<script>  
        function validateform(){  
        var email=document.myform.email.value;  
        var password=document.myform.password.value;  
          
        if (email==null || email==""){  
          alert("Email can't be blank");  
          return false;  
        }else if(password==null || password=="" || password.length<6){  
          alert("Password must be at least 6 characters long.");  
          return false;  
          }  
        }  

        function validateEmail(email){
        var reg = /^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;

        if (reg.test(email.value) == false) 
        {
            alert('Invalid Email Address');
            return false;
        }

        return true;

}    
        </script> 

<link href='Retailer_Login.css' rel='stylesheet' type='text/css'>
<div class="logo"></div>
<div class="login-block">
        <form name="myform" method="post" onsubmit="return validateform()" action="RetailerLogin.lti" > 
    <h1>Retailer's Login</h1>
    <input type="text" value="" placeholder="Email" name="retailerEmail" onblur="validateEmail(this);" />
    <input type="password" value="" placeholder="Password" name="retailerPassword" />
    <button type="submit" >SUBMIT</button>
    <label><a href="forgot_pass.html">Forgot Password?</a></label><br><br>
    
    </form>
    <a href="retailer_signup.html"><button>New Retailer? Sign up</button></a>
</div>
</body>
</html>