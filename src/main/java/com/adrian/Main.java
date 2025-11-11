package com.adrian;

// import java.util.Objects;
// import java.util.Random;
import java.util.Scanner;

import com.adrian.ejercicios.Bibliotek;
import com.adrian.ejercicios.Camper;
import com.adrian.ejercicios.Factorial;
import com.adrian.game.ahoracado.Ahorcado;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean flag = true;
        var biblioteka = new Bibliotek();
        var ahoracado = new Ahorcado();
        var factorial = new Factorial();
        while (flag) {
            System.out.println("""
                    ++++++++++++++  MENU  ++++++++++++++
                            ** Ingrese la opcion deseada **
                    1. Listar libros Bibliotek
                    2. Guardar libros Bibliotek
                    3. Jugar al Ahorcado
                    4. Vueltos
                    0. Salir
                    """);
            switch (scan.nextInt()) {
                case 1:
                    biblioteka.listarLibros();
                    break;
                case 2:
                    biblioteka.guardar(scan);
                    break;
                case 3:
                    ahoracado.iniciar();
                    ahoracado.ejecutar(scan);
                    break;
                case 4:
                    System.out.println(factorial.fact(5));
                    System.out.println(factorial.vueltos(10550, 50));
                    break;
                case 5:
                    //Administrativo
                    //Trainer
                    //Colaborador
                    Camper camper = new Camper();
                    camper.nombre = "Andres";
                    camper.apellido = "Perea";
                    camper.edad = 16;
                    camper.tipoDocumento = "TI";
                    camper.documento = "1005123456";
                    camper.estratoSocial = -1;
                    camper.genero = "?";
                    camper.email = "andresitto_777@gmail.com";
                    camper.telefono = "018000918080";
                    camper.nivelIngles = 10;

                    camper.dormir();
                    camper.divertirse();

                    camper.reportar();
                    camper.calificar();

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