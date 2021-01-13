/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Stock;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class StockService {
    
    public Stock findByIdProduit(String idProduit ,List <Stock>stocks ){
        for (int i = 0; i < stocks.size(); i++) {
            Stock p = stocks.get(i);
          if(p.getIdProduit().equals(idProduit)) { 
           return p;
          }
        }
        return null;
    }
    
     public Stock findByIdMagasint(String idMagasin ,List <Stock>stocks ){
        for (int i = 0; i < stocks.size(); i++) {
            Stock m = stocks.get(i);
          if(m.getIdMagasin().equals(idMagasin)) { 
           return m;
          }
        }
        return null;
    }
}
