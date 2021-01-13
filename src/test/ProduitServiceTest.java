/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bean.Produit;
import java.util.ArrayList;
import java.util.List;
import service.ProduitService;

/**
 *
 * @author lenovo
 */
public class ProduitServiceTest {
    public static void main(String[] args) {
        ProduitService p = new ProduitService ();
    List<Produit> produits = new ArrayList <> ();
    
    Produit p1= p.AjouterProduit("EEA1", "A", "225", produits);
    System.out.println ("p1 = " + p1); 
    Produit q= p.AjouterProduit("EEA2", "B", "253", produits);
    System.out.println ("q = " + q);
    Produit t=p.AjouterProduit("EEA3", "C", "554", produits);
    System.out.println("t = " + t);
    produits.add(p1);
     produits.add(q);
    produits.add(t);
    
    
    Produit p2 =p.findById("EEA2", produits);
        System.out.println("p2 = " + p2);
    Produit p3=p.findById("EEA1", produits);
        System.out.println("p3 = " + p3);
     int p4=p.findByIndexId("EEA2", produits);
        System.out.println("p4 = " + p4);
        List<Produit> p5=p.findByReference("554", produits);
        System.out.println("p5 = " + p5);
        int p6=p.SupprimerProduit("EEA3", produits);
        System.out.println("p6 = " + p6);
     Produit p7=p.findById("EEA3", produits);
        System.out.println("p7 = " + p7);
         int p8=p.SupprimerProduit("EEA3", produits);
        System.out.println("p8 = " + p8);
       Produit p9= p.AjouterProduit("EEA1", "B", "635", produits);
       System.out.println ("p1 = " + p1); 
    }
    
}
