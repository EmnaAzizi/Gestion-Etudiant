/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.io.Serializable;

/**
 *
 * @author HP
 */
public class Etudiant extends User implements Serializable {

    public Etudiant(String nom, String prenom, String mail, String tlp, String adr, String log, String pass, String type) {
        super(nom, prenom, mail, tlp, adr, log, pass, type);
    }
    
}
