
<%@page import="metier.Administrateur"%>
<html>
    <head>
            <style type="text/css">
            
   
body {
    background-image: url('az.jpg');
    background-repeat: no-repeat;
    background-size: cover;
}

               .myButton {
	-moz-box-shadow: 0px 0px 0px 2px #9fb4f2;
	-webkit-box-shadow: 0px 0px 0px 2px #9fb4f2;
	box-shadow: 0px 0px 0px 2px #9fb4f2;
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #7892c2), color-stop(1, #476e9e));
	background:-moz-linear-gradient(top, #7892c2 5%, #476e9e 100%);
	background:-webkit-linear-gradient(top, #7892c2 5%, #476e9e 100%);
	background:-o-linear-gradient(top, #7892c2 5%, #476e9e 100%);
	background:-ms-linear-gradient(top, #7892c2 5%, #476e9e 100%);
	background:linear-gradient(to bottom, #7892c2 5%, #476e9e 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#7892c2', endColorstr='#476e9e',GradientType=0);
	background-color:#7892c2;
	-moz-border-radius:10px;
	-webkit-border-radius:10px;
	border-radius:10px;
	border:1px solid #4e6096;
	display:inline-block;
	cursor:pointer;
	color:#ffffff;
	font-family:Arial;
	font-size:19px;
	padding:12px 37px;
	text-decoration:none;
	text-shadow:0px 1px 0px #283966;
}
  .fieldset-auto-width {
         display: inline-block;
          
    }
    .hide {
        display:none;
         }
         
.myButton:hover {
	background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #476e9e), color-stop(1, #7892c2));
	background:-moz-linear-gradient(top, #476e9e 5%, #7892c2 100%);
	background:-webkit-linear-gradient(top, #476e9e 5%, #7892c2 100%);
	background:-o-linear-gradient(top, #476e9e 5%, #7892c2 100%);
	background:-ms-linear-gradient(top, #476e9e 5%, #7892c2 100%);
	background:linear-gradient(to bottom, #476e9e 5%, #7892c2 100%);
	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#476e9e', endColorstr='#7892c2',GradientType=0);
	background-color:#476e9e;
}
.myButton:active {
	position:relative;
	top:1px;
}

        </style>
        <title>Gestion de Cours </title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body >
  
        

   
    <center><h1>  <font> 
             <font color="#285c82">
           Gestion des Etudiants     
           
      </font>
</h1>
      <br>
     
      <img src="etud.png" width="100" height="100"/>
    
    <br> <br> 
      
      <br> <br><input type="submit" value="Supprimer Etudiant" class="myButton" onclick="myfun1()"/>
     
          <br> <br><input type="button" value="Rechercher Etudiant" class="myButton" onclick="myfun()" />
          <br> <br>
           <a href="${pageContext.request.contextPath}/BienAdmin.jsp"  class="myButton">Retour</a>
      <script>
          function myfun(){
              
              document.getElementById("fieldset").className = "fieldset-auto-width";
              
          }
          
      </script>  
          <script>
          function myfun1(){
              
              document.getElementById("fieldset1").className = "fieldset-auto-width";
              
          }
          
      </script>  
      <br><br>
      <fieldset id="fieldset" class="hide">
   
          <legend id="legend">Vous avez selection� : Recherche Etudiant</legend>
    <div id="placeholder">
        <div id="template">
  <form Action="/tpp/rechercheEtudiant" method="post">
            <p>Recherche Par Nom : &nbsp; <input type ="text" size="25" name="nom" /><br /></p>   
        </div> <!-- template -->
    </div> <!-- placeholder -->

    <button type="Submit">Rechercher</button></p>
   </form>
      </fieldset>
    
      <fieldset id="fieldset1" class="hide">
   
          <legend id="legend">Vous avez selection� : Supprimer Etudiant</legend>
    <div id="placeholder">
        <div id="template">
  <form Action="/tpp/SupprimerEtudiant1" method="post">
            <p>Entrer l'ID de l'Etudiant � Supprimer: &nbsp; <input type ="text" size="25" name="id" /><br /></p>   
        </div> <!-- template -->
    </div> <!-- placeholder -->

    <button type="Submit">Supprimer</button></p>
   </form>
      </fieldset>  
     
</center> 
  

  
    </body>
</html>
