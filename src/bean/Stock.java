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
public class Stock {
    private String id;
    private String idMagasin ;
    private String idProduit ;
    private double quantite;

    
    public Stock() {
    }

    public Stock(String id, String idMagasin, String idProduit, double quantite) {
        this.id = id;
        this.idMagasin = idMagasin;
        this.idProduit = idProduit;
        this.quantite = quantite;
    }

    public Stock(String id, String idMagasin, String idProduit) {
        this.id = id;
        this.idMagasin = idMagasin;
        this.idProduit = idProduit;
    }

    public Stock(String id, String idMagasin) {
        this.id = id;
        this.idMagasin = idMagasin;
    }
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdMagasin() {
        return idMagasin;
    }

    public void setIdMagasin(String idMagasin) {
        this.idMagasin = idMagasin;
    }

    public String getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(String idProduit) {
        this.idProduit = idProduit;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    @Override
    public String toString() {
        return "Stock{" + "id=" + id + ", idMagasin=" + idMagasin + ", idProduit=" + idProduit + ", quantite=" + quantite + '}';
    }
    
}
