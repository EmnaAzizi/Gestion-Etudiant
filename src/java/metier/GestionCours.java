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
public class GestionCours {
     
    
    
    public String ajout_cours(String id , String heure ,String matiere ,String prof ,String salle) throws ClassNotFoundException, SQLException
    {
    Connection c;
 Statement stmt;
ResultSet rs ;
 String query;
    Class.forName("org.apache.derby.jdbc.ClientDriver");
c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
stmt = c.createStatement();


query = "insert into COURS values('"+id+"','"+matiere+"','"+prof+"','"+salle+"','"+heure+"')";
try {
int i = stmt.executeUpdate(query);
}
catch (SQLException e ){
  return "";
}        stmt.close();
c.close();
return "Cours a été ajouté";
}

 public String supp_cours(String id ) throws SQLException 
 {
try {
    Connection c;
    Statement stmt;
    ResultSet rs ;
    String query;
    Class.forName("org.apache.derby.jdbc.ClientDriver");
    c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
    stmt = c.createStatement();
    query = "delete from COURS where id='"+id+"'";
    try {
        int i = stmt.executeUpdate(query);
    }
    catch (SQLException e ){
        return "Nom de cours introuvable dans la liste des cours";
    }
   
           stmt.close();
c.close();
    
}
catch (ClassNotFoundException ex ){
return "erreur de suppression ";           
}
    
   return "le Cours ayant le nom "+ id + " a été supprimé";  
    }

public Cours rech_cours(String id ) throws ClassNotFoundException   
 {Cours cc=null;
   String r1="" , r2 ="",r3="" ,r4 ="" ,r5="";
        try {
            Connection c;
            Statement stmt;
            ResultSet rs ;
            String query;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
            stmt = c.createStatement();
            rs = stmt.executeQuery("select * from Cours where id='"+id+"'");
         
            while (rs.next()) {
                r1 = rs.getString("matiere");
                r2 = rs.getString("prof");
                r3 = rs.getString("heure");
                
                r4 = rs.getString("salle");
                  r5 = rs.getString("id");
            } 
                   stmt.close();
c.close();
        } catch (SQLException ex) {
           
        }
 cc=new Cours(r5,r3,r1,r2,r4);
 return cc;
 }

public String liste () throws SQLException{
           String ch ="La liste des Cours disponibles dans l'université <br> <br> <br>"+
                    "<table><tr><td>ID &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;"
                   + "</td> <td> Matiere&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </td> <td>Professeur &nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;"
                   + "</td><td>Salle&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;</td><td> Heure&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;</td></tr>" ;
        try {
         
            
            Connection c;
            Statement stmt;
            ResultSet rs ;
            String query;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
            stmt = c.createStatement();
            
            rs = stmt.executeQuery("select * from Cours ");    
            while (rs.next()) {

String r1 = rs.getString("id");
String r2 = rs.getString("matiere");
String r3 = rs.getString("prof");
String r4 = rs.getString("heure");
String r5 = rs.getString("salle");


ch=ch+"<tr><td>"+r1+" </td> <td> "+r2+" </td> <td>"+r3+" </td><td>"+r4+"</td><td> "+r5+"</td></tr>" ;

            }
stmt.close();
c.close();
        } catch (ClassNotFoundException ex) {
        return"classe not found";   
        }
    ch=ch+"</table>";
    return ch ; 
    }




}
    

