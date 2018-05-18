/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author HP
 */
public class Cours {
    private String id;
    private String heure;
    private String matiere;
    private String prof;
    private String salle;
    Cours (String id , String heure ,String matiere ,String prof ,String salle) {
    this.id=id; 
    this.salle=salle; this.heure=heure ; 
    this.prof=prof; 
    this.matiere=matiere ; 
    
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the heure
     */
    public String getHeure() {
        return heure;
    }

    /**
     * @return the matiere
     */
    public String getMatiere() {
        return matiere;
    }

    /**
     * @return the prof
     */
    public String getProf() {
        return prof;
    }

    /**
     * @return the salle
     */
    public String getSalle() {
        return salle;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param heure the heure to set
     */
    public void setHeure(String heure) {
        this.heure = heure;
    }

    /**
     * @param matiere the matiere to set
     */
    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    /**
     * @param prof the prof to set
     */
    public void setProf(String prof) {
        this.prof = prof;
    }

    /**
     * @param salle the salle to set
     */
    public void setSalle(String salle) {
        this.salle = salle;
    }
    
}
