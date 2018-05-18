
<html>
    <head>
            <style type="text/css">
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
        <title>Inscription </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body style="background-color:#E6E6FA">
 <P> 
     
<FORM METHOD="POST" ACTION="/tpp/ServletInscription1" style="background-color:#E6E6FA">
    <P>   
    <center><h1>  <font color="#DA23BC" >Bienvenue </h1></center> 
    <br>
    <br>
   
    <font color ="#00000">
<P> Nom *:&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; <INPUT NAME="nom" TYPE=" TEXT" SIZE=" 12" MAXLENGTH="50">
<P> Prenom * :&nbsp; &nbsp;    <INPUT NAME="prenom" TYPE=" TEXT" SIZE=" 12" MAXLENGTH="50">
<P> Adresse : &nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="adresse" value="" SIZE=" 12" MAXLENGTH="50">
<P> Email : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  &nbsp;   <input type="text" name="email" value="" SIZE=" 12" MAXLENGTH="50">
<P> Telephone :&nbsp; <input type="text" name="tlp" value="" SIZE=" 12" MAXLENGTH="50" SIZE=" 20">
<P> Login *:   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" name="log" value="" SIZE=" 12" MAXLENGTH="50">
<P> Password *:&nbsp; <input type="password" name="pass" value="" SIZE=" 12" MAXLENGTH="50">  
<P> Type *:&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp; <select name="type"><option>Administrateur </option> 
        <option>Etudiant</option></select>
    <br> <br>  <br>  
    <center> 
    
     <input type="submit" value="s'inscrire" class="myButton"/>
  <br>  <br>  <br> 
*  : Champ Obligatoire 
  <br> <br>
<br>
 
    <button onclick="goBack()" class="myButton" >Retour</button>
    <script>
function goBack() {
    window.history.back();
}
</script></center>




</FORM>
    </body>
</html>
