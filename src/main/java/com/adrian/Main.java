package com.adrian;

// import java.util.Objects;
// import java.util.Random;
import java.util.Scanner;

import com.adrian.ejercicios.User.User;

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
        var user = new User();
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Crear usuario
                    2. Usar usuario
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                    user.crearUsuario();
                    break;
                case 2:
                    break;
                case 0:
                    // Salir
                    flag = false;

                    break;
                default:
                    System.out.println("Ingrese una opcion valida......\nPresione Enter para continuar.");
                    scan.nextLine();
                    break;
            }
        }
        scan.close();
    }
}