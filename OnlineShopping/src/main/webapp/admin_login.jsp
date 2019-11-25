
<link href='admin.css' rel='stylesheet' type='text/css'>
<div class="logo"></div>
<div class="login-block">
	${ message }
        <form method="post" name="myform"  action="adminLogin.lti" >  
    <h1> Admin Login</h1>
    <input type="text" value="" placeholder="Email" name="adminUsername" onblur="validateEmail(this);">
    <input type="password" value="" placeholder="Password" name="adminPassword" required>
    <button type="submit">SUBMIT</button>
    <label><a href="forgot_pass.html">Forgot Password?</a></label>
    <br/><br/>

</form>
</div>