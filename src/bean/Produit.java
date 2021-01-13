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
public class Produit {
    private String id ;
    private String libelle ;
    private String reference ;
    private double qteTotale ;

    public Produit() {
    }

    public Produit(String id, String libelle) {
        this.id = id;
        this.libelle = libelle;
    }

    public Produit(String id, String libelle, String reference) {
        this.id = id;
        this.libelle = libelle;
        this.reference = reference;
    }

    public Produit(String id, String libelle, String reference, double qteTotale) {
        this.id = id;
        this.libelle = libelle;
        this.reference = reference;
        this.qteTotale = qteTotale;
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

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public double getQteTotale() {
        return qteTotale;
    }

    public void setQteTotale(double qteTotale) {
        this.qteTotale = qteTotale;
    }

    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", reference=" + reference + ", qteTotale=" + qteTotale + '}';
    }

    
    
      
    
    
}
