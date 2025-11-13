package com.adrian.ejercicios.User;

public class User {
    protected String username;
    private String password;

    public User() {
        
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public String showInfo() {
        return "Nombre de usuario: " + username;
    }
}
