package com.adrian.game.ahoracado;

import java.util.Random;
import java.util.Scanner;

public class Ahorcado {
    String palabraSecreta, palabraTablero;
    String[] palabras;
    int intentos;
    int errores;

    public Ahorcado(){ //Metodo especial - Constructor
        palabras = new String[] {
            "programacion",
            "java",
            "computadora",
            "teclado",
            "internet",
            "variable",
            "funcion",
            "objeto",
            "clase",
            "constructor",
            "compilador",
            "algoritmo",
            "desarrollador",
            "interfaz",
            "depuracion"
        };
        //AQUI
        palabraTablero = "";
        errores = 0;
        intentos = 0;
    }

    public void iniciar(Scanner scan) {
        var r = new Random();
        palabraSecreta = palabras[r.nextInt(palabras.length)]; //Interfaz
        var flag = "_ ";
        palabraTablero = "";
        for (int a = 0; a < palabraSecreta.length(); a++) {
            palabraTablero += flag; //_ _ _ _ _ _ _ _
        }

        // System.out.println(palabraSecreta + "\n" + palabraTablero);
        // ejecutar();
    }

    public void ejecutar() {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("**** AHORCADO ****\n");
        strBuild.append("\tIntentos restanates: ");
        strBuild.append(intentos);
        strBuild.append("\tErrores: ");
        strBuild.append(errores);
        strBuild.append("\n");
        strBuild.append(palabraTablero);
        while (true) {
            System.out.println(strBuild.toString());
            break;
        }
    }
}
