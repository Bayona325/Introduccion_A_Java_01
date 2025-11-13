package com.adrian.ejercicios.User;

public class Admin extends User{
    //private String username, password;
    private String[] permissions;

    public Admin() {

    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    public void setPermissions(String permission) {
        this.permissions = new String[]{permission};
    }

    public String showPermissions() {
        var concat = "";
        for (String item : permissions) {
            concat += item + ",";
        }
        return concat;
    }

    @Override
    public String showInfo() {
        return username + " " +showPermissions();
    }
}
