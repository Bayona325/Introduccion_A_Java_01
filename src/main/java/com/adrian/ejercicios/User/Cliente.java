package com.adrian.ejercicios.User;

public class Cliente extends User {

    @Override
    public void setUsername(String username) {
        this.username =  "CLI-" + username;
    }

    @Override
    public void setPassword(String password) {
        this.password = "password"+ password;
    }
    
}