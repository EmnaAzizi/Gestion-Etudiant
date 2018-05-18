/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier ; 



import java.sql.*;
import java.io.*;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class User
{ 
  private String nom; 
    private String prenom; 
    private String adr; 
    private String tlp; 
    private String mail; 
    private String log; 
    private String pass; 
private String type; 


 

   public User(String nom, String prenom, String mail,
            String tlp, String adr, String log, String pass,String type) {
    
     this.mail=mail;
    this.pass=pass;
    this.tlp=tlp;
    this.adr=adr;
    this.nom=nom;
    this.prenom=prenom; 
       this.log=log;  
    this.type=type ; }

public String inscrire()
        throws SQLException, ClassNotFoundException
{Connection c;
 Statement stmt;
ResultSet rs ;
 String query;
    Class.forName("org.apache.derby.jdbc.ClientDriver");
c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
stmt = c.createStatement();


query = "insert into INSCRIT values('"+nom+"','"+prenom+"','"+adr+"','"+log+"','"+pass+"','"+type+"','"+mail+"','"+tlp+"')";
try {
int i = stmt.executeUpdate(query);
}
catch (SQLException e ){
   return e.toString();
}
return "";
}

public Hashtable validate(User c) {
   Hashtable<String, String> table = new Hashtable<String, String>();
  if (  c.getNom().length()==0 )
   table.put("nom", "Nom est vide : Champ Obligatoire");
  if (  c.getPrenom().length()==0)
   table.put("prenom", "Prenom est vide : Champ Obligatoire");
  
  if (  c.getTlp().length()!=0){
  try {
  
      int k =Integer.parseInt(c.getTlp());}
  catch(NumberFormatException e) {
  table.put("tlp", "Le telephone doit être numerique");
  }}
   
  if (  c.getMail().length()!=0 && (c.getMail().indexOf("@")<=0)&&(c.getMail().indexOf(".")<=0))
  table.put("mail", "Mail est invalide");
   if ( c.getLog().length()==0)
  table.put("login", "Login est vide"); 
      if ( c.getPass().length()==0)
  table.put("password", "mot de passe est vide : Champ Obligatoire");
         if ( c.getType().length()==0 )
   table.put("type", "type est vide : Champ Obligatoire ");
         if (!"Administrateur".equals(c.type) &&!"Etudiant".equals(c.type))
              table.put("type2", "Le type doit être Administrateur/Etudiant ");
return table ; 
}

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getAdr() {
        return adr;
    }
    public String getTlp() {
        return tlp;
    }public String getMail() {
        return mail;
    }
    public String getLog() {
        return log;
    }

    public String getPass() {
        return pass;
    }
    public String getType() {
        return type;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @param adr the adr to set
     */
    public void setAdr(String adr) {
        this.adr = adr;
    }

    /**
     * @param tlp the tlp to set
     */
    public void setTlp(String tlp) {
        this.tlp = tlp;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }

    
    public void setLog(String log) {
        this.log = log;
    }

    /**
     * @param pass the pass to set
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
/*public static void main (String[] args) throws IOException {

User c= new User(null,"az","mail1","256545555","ariana",null,"jjjjff","Admib");
      try {
          c.inscrire();
          //public User(String nom, String prenom, String mail,
          //         String tlp, String adr, String log, String pass,String type)
      } catch (SQLException ex) {
          System.out.println(ex);
         
      } catch (ClassNotFoundException ex) {
          System.out.println(ex);
         
      }
}
*/
}