package com.adrian;

public class Condicionales {
    // 4. Crea un programa que diga si un número es par o impar

    /**
     * Esto son el bloque
     */
    int input = 11;

    public void esPar() {
        if(input % 2 == 0) {
            //Par
            System.out.println("Es par");
        } else {
            //Par'nt
            System.out.println("No es par");
        }
    }

    //Declara una variable con el día de la semana (1-7) y
    //muestra su nombre con switch
    public static void diaSemana(int dia) {
        switch (dia) {
            case 1:
                    System.out.println("Domingo");
                break;
            case 2:
                    System.out.println("Lunes");
                break;
            case 3:
                    System.out.println("Martes");
                break;
            case 4:
                    System.out.println("Miercoles");
                break;
            case 5:
                    System.out.println("Jueves");
                break;
            case 6:
                    System.out.println("Viernes");
                break;
            default:
                System.out.println("Sabado");
                break;
        }
    }

    //Comprueba si una cadena de texto contiene una palabra concreta.
    //1500
    public boolean estaLaPalabra(String cadena, String palabra) {
        return cadena.contains(palabra);
    }
    //Muestra la longitud de una cadena de texto.
    public int longitudDeText(String cadena) {
        return cadena.length();
    }
}
