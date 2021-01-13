/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

/**
 *
 * @author lenovo
 */
public class Magasin {
      private String id ;
      private String libelle;
      private String adresse;

    public Magasin() {
    }

    public Magasin(String id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Magasin(String id, String libelle, String adresse) {
        this.id = id;
        this.libelle = libelle;
        this.adresse = adresse;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Magasin{" + "id=" + id + ", libelle=" + libelle + ", adresse=" + adresse + '}';
    }
    
      
}
