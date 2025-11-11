package com.adrian;

// import java.util.Objects;
// import java.util.Random;
import java.util.Scanner;

import com.adrian.ejercicios.Bibliotek;
import com.adrian.ejercicios.Camper;
import com.adrian.ejercicios.Factorial;
import com.adrian.ejercicios.Trainer;
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
                    5. Camper
                    6. Trainer
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
                    Camper camper = new Camper("Andres", "Perea", 16, "TI", "1005123456", "?", "andresitto_777@gmail.com", "018000918080");
                    System.out.println(camper.telefono);
                    /*camper.nombre = "Andres";
                    camper.apellido = "Perea";
                    camper.edad = 16;
                    camper.tipoDocumento = "TI";
                    camper.documento = "1005123456";
                    camper.estratoSocial = -1;
                    camper.genero = "?";
                    camper.email = "andresitto_777@gmail.com";*/
                    camper.telefono = "018000918080";
                    System.out.println(camper.telefono);
                    //camper.nivelIngles = 10;

                    camper.dormir();
                    camper.divertirse();

                    camper.reportar();
                    camper.calificar();

                    break;
                case 6:
                    Trainer trainer = new Trainer();
                    trainer.nombre = "Adrian";
                    trainer.apellido = "Triener";
                    /*
                    trainer.edad = 27;
                    trainer.tipoDocumento = "CC";
                    trainer.documento = "1005198456";
                    trainer.estratoSocial = 4;
                    trainer.genero = "Hombre";
                    trainer.email = "adrian_trainer@gmail.com";
                    trainer.telefono = "0180009";
                    trainer.nivelIngles = 10;
                    */

                    trainer.dormir();
                    trainer.divertirse();

                    trainer.reportar();
                    trainer.calificar();
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