/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Produit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class ProduitService {
    
    public Produit findById(String id , List<Produit> produits){
        for (int i = 0; i < produits.size(); i++) {
            Produit p = produits.get(i);
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    public  List<Produit> findByReference( String ref , List<Produit> produits){
       List<Produit> resultat = new ArrayList<>();
        for (int i = 0; i < produits.size(); i++) {
            Produit p = produits.get(i);
            if(p.getReference().equals(ref)){
                resultat.add(p);
            }
        }
        return resultat ;
    }
      public int findByIndexId(String id,List<Produit> produits){
          for (int i = 0; i < produits.size(); i++) {
              Produit p = produits.get(i);
             if(p.getId().equals(id)) {
                 return i;
             }
          }
          return -1;
      }
    public Produit AjouterProduit(String id,String libelle,String reference,List<Produit> produits){
        Produit p= findById(id, produits);
        if(p!= null){
           p.setQteTotale(p.getQteTotale()+1);
           return p;
        }
        else{
           Produit q= new Produit(id, libelle, reference, 1);
           return q;
        }
       
}
    public int SupprimerProduit(String id,List<Produit> produits){
        Produit p= findById(id, produits);
        if(p== null){
           return -1;
        }
        else if(p!=null && p.getQteTotale()<=0){
            return -2;
        }
                else{
           p.setQteTotale(p.getQteTotale()-1);
        }
       return 1; 
}
}