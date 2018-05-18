/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class GestionUser {
    private User u;
    
    
    
    public User inscrire(String nom ,String prenom ,String adr ,String log, String pass , String type , String mail , String tlp)
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
  
}
User u = new User(nom, prenom, mail,  tlp,  adr, log,  pass,type);
return u ;
}
   
    
    
    public  User authentifier (String log , String pass ,String type ) throws ClassNotFoundException
    {   try {
        Connection c;
        Statement stmt;
        ResultSet rs ;
        String query;
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
        stmt = c.createStatement();
        
            rs = stmt.executeQuery("select * from INSCRIT "
        + "where login='"+log+"' and password='"+pass+"' and typee='"+type+"'");
         String r1="",r2="",r3="",r4="",r5="",r6="",r7="",r8="",r9="";
            while (rs.next()) {

 r1 = rs.getString("nom");

 r2 = rs.getString("prenom");
 r3 = rs.getString("typee");
  r4 = rs.getString("email");
   r5 = rs.getString("telephone");
    r6 = rs.getString("adresse");
    r7 = rs.getString("login");
     r8 = rs.getString("password");
      r9 = rs.getString("typee");
}
 stmt.close();
c.close();

if(type.equalsIgnoreCase("Administrateur"))
{
Administrateur a= new Administrateur(r1, r2, r4,  r5,  r6, r7,  r8,r9);
u=a;
}
else if (type.equalsIgnoreCase("Etudiant"))
{
Etudiant e= new Etudiant(r1, r2, r4,  r5,  r6, r7, r8 ,r9);
u=e;
}

        } catch (SQLException ex) { u=null; }
    
    return u ; 
     }
  public String supp_etud(String id ) throws SQLException 
 {
try {
    Connection c;
    Statement stmt;
    ResultSet rs ;
    String query;
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
    stmt = c.createStatement();
    query = "delete from INSCRIT where login='"+id+"'";
    try {
        int i = stmt.executeUpdate(query);
    }
    catch (SQLException e ){
        return "Etudiant introuvable dans la liste des Etudiants de l'université";
    }
   
           stmt.close();
c.close();
    
}
catch (ClassNotFoundException ex ){
return "erreur de suppression ";           
}
    
   return "l'Etudiant ayant le login "+ id + " a été supprimé";  
    }   

public Etudiant rech_etud(String nom )throws ClassNotFoundException
    {    Etudiant e = null;
        try {
         
            Connection c;
            Statement stmt;
            ResultSet rs ;
            String query;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
            stmt = c.createStatement();
            rs = stmt.executeQuery("select * from INSCRIT "
                    + "where nom='"+nom+"' and typee='Etudiant'");
            String r1="",r2="",r3="",r4="",r5="",r6="" ,r7="",r8="",r9="";
            while (rs.next()) {
                    
                r1 = rs.getString("typee");
                r9 = rs.getString("nom");  
                r2 = rs.getString("prenom");
                r3 = rs.getString("typee");
                r4 = rs.getString("email");
                r5 = rs.getString("telephone");
                r6 = rs.getString("adresse");
 r7 = rs.getString("login");
 r8 = rs.getString("password");

 }
           e= new Etudiant(r9, r2, r4,  r5,  r6, r7,  r8,r1);

        } catch (SQLException ex) {
            Logger.getLogger(GestionUser.class.getName()).log(Level.SEVERE, null, ex);
        }
return e; 

}


}




