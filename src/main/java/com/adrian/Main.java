package com.adrian;

import com.adrian.ejercicios.User.User;
import com.adrian.ejercicios.User.Admin;
import com.adrian.ejercicios.User.Cliente;

// import java.util.Objects;
// import java.util.Random;
import java.util.*;

public class Main {
    final static int maxRange = 10000;
    public static void main(String[] args) {
        /**
         * Crea una clase User con los atributos privados username y password.
         * Implementa los métodos setUsername(String username),
         * setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas. 
         */
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        // User[] otraforma = new User[100];
        List<User> usuarios = new ArrayList<>();

        usuarios.add(new Cliente());
        usuarios.add(new Admin());
        usuarios.add(new Admin());

        // User common = new Cliente(); // 0
        // Admin admin = new Admin(); // 1
        // User user = new Admin(); // 2

        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                      ** Ingrese la opcion deseada **
                    1. Ingrese su nombre
                    2. Ingrese su contraseña
                    3. Valide su contraseña
                    4. Agregar permisos (ADMINISTRADORES)
                    5. Ver permisos (ADMINISTRADORES)
                    6. Ver info
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 6:
                    System.out.println(usuarios.get(0).showInfo());
                    System.out.println(usuarios.get(1).showInfo());
                    break;
                case 5:
                    for (User item : usuarios) {
                        if(item instanceof Admin) {
                            var admin = (Admin)item;
                            System.out.println(admin.showPermissions());
                        }
                    }
                    break;
                case 4:
                    scan.nextLine();
                    var permiso = scan.nextLine();
                    var permisos = new String[] { "x", "y", "z" };
                    // common.setPermissions();
                    ((Admin)usuarios.get(1)).setPermissions(permiso);
                    ((Admin) usuarios.get(2)).setPermissions(permisos);
                    // ((Admin)common).setPermissions(permisos); X
                    break;
                case 1:
                    scan.nextLine();
                    var tempName = scan.nextLine();
                    usuarios.get(0).setUsername(tempName);
                    usuarios.get(1).setUsername(tempName);
                    usuarios.get(2).setUsername(tempName);
                    break;
                case 2:
                    scan.nextLine();
                    var tempPassword = scan.nextLine();
                    usuarios.get(0).setPassword(tempPassword);
                    usuarios.get(1).setPassword(tempPassword);
                    usuarios.get(2).setPassword(tempPassword);
                    break;
                case 3:
                    scan.nextLine();
                    var tempCheckPassword = scan.nextLine();
                    System.out.println("User: " + usuarios.get(0).checkPassword(tempCheckPassword));
                    System.out.println("Admin: " + usuarios.get(1).checkPassword(tempCheckPassword));
                    System.out.println("User-Admin: " + usuarios.get(2).checkPassword(tempCheckPassword));
                    break;
                case 0:
                    // Salir
                    flag = false;

                    break;
                default:
                    System.out.println("Ingrese una opcion " +
                            "valida......\nPresione Enter para continuar.");
                    scan.nextLine();
                    break;
            }
        }
        scan.close();
    }
}