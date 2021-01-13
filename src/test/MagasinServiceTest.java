/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import bean.Magasin;
import java.util.ArrayList;
import java.util.List;
import service.MagasinService;

/**
 *
 * @author lenovo
 */
public class MagasinServiceTest {
    public static void main(String[] args) {
        MagasinService m =new MagasinService();
        List<Magasin> magasins = new ArrayList <> ();
        
        int m1 = m.save("EE1", "Gueliz", "marwa", magasins);
        System.out.println("m1 = " + m1);
        int m2 = m.save("EE2", "Menara","HM",magasins );
        System.out.println("m2 = " + m2);
        int m3 = m.save("EE3","massira", "zara",magasins);
        System.out.println("m3 = " + m3);
        int m4 = m.save("EE4", "targa", "marwa", magasins);
        System.out.println("m4 = " + m4);
        int m5 = m.save("EE5", "Gueliz", "zara", magasins);
        System.out.println("m5 = " + m5);
        
        Magasin res1=m.findById("EE1", magasins);
        System.out.println("res1 = " + res1);
         List<Magasin> res2=m.findByAdress("Gueliz", magasins);
         System.out.println("res2 = " + res2);
          List< Magasin> res3= m.findByLibelle("zara", magasins);
           System.out.println("res3 = " + res3);
             int res4=m.findByIndexId("EE2", magasins);
             System.out.println("res4 = " + res4);
               int res5=m.findByIndexLibelle("zara", magasins);
               System.out.println("res5 = " + res5);
                int res6=m.findByIndexLibelle("HM", magasins); 
                System.out.println("res6 = " + res6);
                int res7=m.delet("EE2", magasins);
               System.out.println("res7 = " + res7);
               int res8=m.delet("EE1", magasins);
               System.out.println("res8 = " + res8);
               Magasin res9=m.findById("EE1", magasins);
              System.out.println("res9 = " + res9);
              int res10=m.deletByAdress("marwa", magasins);
               System.out.println("res10 = " + res10);
        List<Magasin> res11=m.findByAdress("marwa", magasins);
            System.out.println("res11 = " + res11);
    }
}
               
                        
