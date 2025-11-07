package com.adrian;

// import java.util.Objects;
// import java.util.Random;
import java.util.Scanner;

public class Main {
    final static int maxRange = 10000;
    public static void main(String[] args) {
        /* 
        String cadena = "Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.";
        // Se usa con una instancia de la Clase
        Condicionales instancia = new Condicionales();
        System.out.println(instancia.mayor(0, 0, 0));
        System.out.println(instancia.mayor(-11, -9, -1));
        System.out.println(instancia.mayor(2, 10, 0));
        System.out.println(instancia.mayor(10, 100, 2));
        System.out.println(instancia.mayor(100, 10, 200));
        // System.out.println(instancia.cadenaFormateada(cadena).length());
        // System.out.println(cadena.length());
        instancia.esPar();
        int resultado = instancia.longitudDeText("Lorem Ipsum es simplemente el texto de relleno de las imprentas y archivos de texto. Lorem Ipsum ha sido el texto de relleno estándar de las industrias desde el año 1500, cuando un impresor (N. del T. persona que se dedica a la imprenta) desconocido usó una galería de textos y los mezcló de tal manera que logró hacer un libro de textos especimen. No sólo sobrevivió 1500 años, sino que tambien ingresó como texto de relleno en documentos electrónicos, quedando esencialmente igual al original. Fue popularizado en los 60s con la creación de las hojas \"Letraset\", las cuales contenian pasajes de Lorem Ipsum, y más recientemente con software de autoedición, como por ejemplo Aldus PageMaker, el cual incluye versiones de Lorem Ipsum.");
        System.out.println("Que muestra? " + resultado);
        System.out.println(
            "Esta? " + (instancia.estaLaPalabra(cadena, "1500") ? "SI" : "NO"));
        //instancia.diaSemana(10);
        // Static - Para operaciones y no almacenan valores
        Condicionales.diaSemana(3);
        */

        /*
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Ingrese el valor minimo: ");
        var min = scan.nextInt();
        System.out.println("Ingrese el valor maximo: ");
        var max = scan.nextInt();


        int[] numbers = new int[maxRange];

        for(int a=0; a < numbers.length; a++) {
            numbers[a] = random.nextInt(min, max+1);
        }

        System.out.println("Ingrese la cantidad de numeros a buscar: ");
        var counter = scan.nextInt();

        for(int a=0; a < counter; a++) {
            System.out.println("Ingrese el inidice a buscar [1 hasta"+maxRange+"]: ");
            var index = scan.nextInt();
            System.out.println("Oiga el indice es: "+ (index)+" = " + numbers[index - 1]);
        }
        scan.close();
        */


        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el titulo del libro: ");
        var title = scan.nextLine();
        System.out.println("Ingrese el nombre del autor del libro: ");
        var autor = scan.nextLine();
        System.out.println("Ingrese el año de publicacion del libro: ");
        var year = scan.nextInt();
        scan.nextLine();
        System.out.println("Ingrese el genero al que pertenece el libro: ");
        var gener = scan.nextLine();
        System.out.println("Ingrese la cantidad de paginas del libro: ");
        var pag = scan.nextInt();

        System.out.println("Titulo: "+title);
        System.out.println("Autor: "+autor);
        System.out.println("Year de publicacion: "+year);
        System.out.println("Genero: "+gener);
        System.out.println("Numero de paginas: "+pag);
        System.out.println("Disfrute el libro y no moleste... en la biblioteca");

        scan.close();

    }
}