/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;
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
public class Administrateur extends User implements Serializable{

    public Administrateur(String nom, String prenom, String mail, String tlp, String adr, String log, String pass, String type) {
        super(nom, prenom, mail, tlp, adr, log, pass, type);
    }
    
    public String liste () throws SQLException{
           String ch ="La Liste Des Etudiants inscrits dans l'université <br> <br> <br>"
                +"<table><tr><td>Nom&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + " &nbsp;&nbsp; &nbsp;&nbsp; </td><td>Prenom&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + " &nbsp;&nbsp; &nbsp;&nbsp; </td><td>Email&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + " &nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                   + "&nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;"
                   + " </td><td>Telephone</td></tr>";
                  
        try {
         
            
            Connection c;
            Statement stmt;
            ResultSet rs ;
            String query;
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            c = DriverManager.getConnection("jdbc:derby://localhost:1527/Azbase","azizi","az");
            stmt = c.createStatement();
            
            rs = stmt.executeQuery("select * from INSCRIT "
                    + "where typee='Etudiant'");    
            while (rs.next()) {
System.out.print("*************");
String r1 = rs.getString("nom");
String r2 = rs.getString("prenom");
String r3 = rs.getString("email");
String r4 = rs.getString("telephone");
ch=ch+"<tr><td>"+r1+"</td><td>"+r2+"</td><td>"+r3+"</td><td>"+r4+"</td></tr>"; 

            }
stmt.close();
c.close();
        } catch (ClassNotFoundException ex) {
        return"class not found";   
        }
    ch=ch+"</table>";
    return ch ; 
    }
    
}
