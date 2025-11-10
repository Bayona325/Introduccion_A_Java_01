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

    public void iniciar() {
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

    public void ejecutar(Scanner scan) {
        
        while (true) {
            System.out.println(mensaje());
            var letra = scan.next();
            var temporal = "";
            if(palabraSecreta.contains(letra)) {
                // a
                // _ _ _ _ _ _ _ _
                temporal = palabraTablero;
                var letras = palabraTablero.replace(" ", "").toCharArray();
                for(int i = 0; i < palabraSecreta.length(); i++) {
                    if(String.valueOf(palabraSecreta.charAt(i)).equals(letra)) {
                        // _ _ _ _ _ _ _ _
                        // 0 1 2 3 4 5 6 7
                        // Cambio _ > a
                        letras[i] = letra.charAt(0); // _ a _ _ _ a _ a 

                    }
                }
                //Asignar
                for (char c : letras) {
                    temporal += String.valueOf(c) + " ";
                }
                palabraTablero = temporal;
                
            } else {
                System.out.println("Ahhh, Erroooor");
                System.out.println("Ta' maaaaaaaal");
            }
        }
    }

    public String mensaje() {
        StringBuilder strBuild = new StringBuilder();
        strBuild.append("**** AHORCADO ****\n");
        strBuild.append("\tIntentos restanates: ");
        strBuild.append(intentos);
        strBuild.append("\tErrores: ");
        strBuild.append(errores);
        strBuild.append("\n");
        strBuild.append(palabraTablero);
        return strBuild.toString();
    }
}
