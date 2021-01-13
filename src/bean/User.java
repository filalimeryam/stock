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
public class User {
   private String login;
   private  String password;
   private  String role;
   private   boolean bloked;

    public User() {
    }

    public User(String login) {
        this.login = login;
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public User(String login, String password, String role, boolean blocked) {
        this.login = login;
        this.password = password;
        this.role = role;
        this.bloked = blocked;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String passeword) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isBlocked() {
        return bloked;
    }

    public void setBlocked(boolean blocked) {
        this.bloked = blocked;
    }

    @Override
    public String toString() {
        return "User{" + "login=" + login + ", password=" + password + ", role=" + role + ", bloked=" + bloked + '}';
    }
   
    
}
