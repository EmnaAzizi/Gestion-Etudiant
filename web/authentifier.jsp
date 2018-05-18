
<html>
    <head>
            <style type="text/css">
            
   
body {
    background-image: url('ur.png');
    background-repeat: no-repeat;
    background-size: cover;
}

                .myButton {
	background-color:#ff5bb0;
	-moz-border-radius:38px;
	-webkit-border-radius:38px;
	border-radius:38px;
	border:2px solid #ee1eb5;
	display:inline-block;
	cursor:pointer;
	color:#ffffff;
	font-family:Arial;
	font-size:23px;
	padding:10px 43px;
	text-decoration:none;
	text-shadow:-2px 2px 0px #c70067;
}
.myButton:hover {
	background-color:#ef027d;
}
.myButton:active {
	position:relative;
	top:1px;
}
        </style>
        <title>S'authentifier </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body background="ur.png">
 <P> 
     
<FORM METHOD="POST" ACTION="/tpp/Servletauthentiff" style="">

    <P>  
        <br>
    <br>
    <center><h1>  <font color="#DA23BC" > S'authentifier </h1></center> 
    <br>
    <br><br>
    <br><br>
    <br><br>
    <br><br>
    <br>
   
    <font color ="#00000">
    <center>
        <strong>
        Login :   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="log" value="" SIZE=" 12" MAXLENGTH="50">
 <br>
    <br>Password :&nbsp; <input type="password" name="pass" value="" SIZE=" 12" MAXLENGTH="50">  
       
        <P> Type :&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <select name="type"><option>Administrateur </option> 
        <option>Etudiant</option></select>
        </strong><br>
    <br><br>
 
    <strong> OU Bien <a href="form.jsp">s'inscire</a> </Strong>
     <br>
    <br>
      <input type="submit" value="Log in" class="myButton"/>
      
      <br> <br> 
    
    </center>
  
  <br>  <br>  <br> 

  

</FORM>
    </body>
</html>
