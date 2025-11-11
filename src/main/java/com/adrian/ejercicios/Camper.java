package com.adrian.ejercicios;

public class Camper {
    public String nombre, apellido;
    public int edad;
    public String tipoDocumento, documento;
    public int estratoSocial;
    public String genero;
    public String email, telefono;
    public int nivelIngles;

    public Camper(String _nombre, String apellido, int edad, String tipoDocumento, String documento, String genero, String email, String telefono) {
        nombre = _nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.genero = genero;
        this.email = email;
        this.telefono = telefono;
        estratoSocial = 1;
        nivelIngles = 1;
    }

    /* 
    public void estudiante() {
        nombre = "Andres";
        apellido = "Perea";
        edad = 16;
        tipoDocumento = "TI";
        documento = "1005123456";
        estratoSocial = -1;
        genero = "?";
        email = "andresitto_777@gmail.com";
        telefono = "018000918080";
        nivelIngles = 10;
    }
    */

    public void cambiarNombre() {
        
    }

    public void dormir() {
        System.out.println("Duerme: "+nombre);
    }

    public void divertirse() {
        System.out.println("se divierte en campus: "+nombre);
    }

    public void estudiar() {
        System.out.println("estudia en campus: "+nombre);
    }

    public void reportar() {
        System.out.println("reporta en campus: "+nombre);
    }

    public void calificar() {
        System.out.println("califica en campus: "+nombre);
    }

    public void asistencia() {
        System.out.println("asiste en campus: "+nombre);
    }
}
