/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Magasin;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class MagasinService {

    public Magasin findById(String id, List<Magasin> magasins) {
        for (int i = 0; i < magasins.size(); i++) {
            Magasin m = magasins.get(i);
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null;
    }

    public List<Magasin> findByAdress(String adress, List<Magasin> magasins) {
        List<Magasin> res = new ArrayList<>();
        for (int i = 0; i < magasins.size(); i++) {
            Magasin m = magasins.get(i);
            if (m.getAdresse().equals(adress)) {
                res.add(m);
            }
        }
        return res;
    }

    public List<Magasin> findByLibelle(String libelle, List<Magasin> magasins) {
        List<Magasin> res = new ArrayList<>();
        for (int i = 0; i < magasins.size(); i++) {
            Magasin m = magasins.get(i);
            if (m.getLibelle().equals(libelle)) {
                res.add(m);
            }
        }
        return res;
    }

    public int findByIndexId(String id, List<Magasin> magasins) {
        for (int i = 0; i < magasins.size(); i++) {
            Magasin m = magasins.get(i);
            if (m.getId().equals(id)) {
                return i;
            }
        }
        return -1;
    }

    public int findByIndexLibelle(String libelle, List<Magasin> magasins) {

        for (int i = 0; i < magasins.size(); i++) {
            Magasin m = magasins.get(i);
            if (m.getLibelle().equals(libelle)) {
                return i;
            }
        }
        return -1;
    }

    public int delet(String id, List<Magasin> magasins) {
        for (int i = 0; i < magasins.size(); i++) {
            Magasin m = magasins.get(i);
            if (m.getId().equals(id)) {
                magasins.remove(i);
                return 1;
            }
        }
        return -1;
    }

    public int deletByAdress(String adress, List<Magasin> magasins) {
        int cmp = 0;
        for (int i = 0; i < magasins.size(); i++) {
            Magasin m = magasins.get(i);
            if (m.getAdresse().equals(adress)) {
                magasins.remove(i);
                cmp++;
            }
        }
        return cmp;
    }

    public int save(String id, String adress, String libelle, List<Magasin> magasins) {
        Magasin m = findById(id, magasins);
        if (m == null) {
            Magasin myMagasin = new Magasin(id, libelle, adress);

            magasins.add(myMagasin);
            return 1;
        } else {
            return -1;
        }
    }

}
