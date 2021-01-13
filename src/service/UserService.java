/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lenovo
 */
public class UserService {
    
    public User findByLogin( String login ,List<User> users){
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
           if(user.getLogin().equals(login)){
           } else {
               return user;
            }
         }
        return null;
    }
    
    public List<User> findByBloked( List<User> users){
        List<User> resultat = new ArrayList<>();
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if(user.isBlocked()==true){
                resultat.add(user);
            }
        }
        return resultat;
    }
    
    public int SeConnecter(String login, String password, List<User> users){
        User foundeduser = findByLogin(login, users);
        if(foundeduser==null){
            return -1;
        }else if(!foundeduser.getPassword().equals(password)){
            return -2;
        }else if(foundeduser.isBlocked()==true){
            return -3;
        }else{
            if(foundeduser.getRole().equalsIgnoreCase("agent")){
            return 1;
        }else {
                return 2;
            }
        }
    }
   
    public int save (User user, List<User> users){
        User loadedUser = findByLogin(user.getLogin(), users);
        if(loadedUser!=null){
            return -1;
        }else {
            user.setBlocked(false);
            user.setRole("agent");
            users.add(user);
            return 1;
        }
    }
    
}
