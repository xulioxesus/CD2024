package com.xulioxesus;

public class Estudiante {

    private static final int APROBADO = 5;
    private static final int EDAD_ESCOLAR = 12;
    private static final int EDAD_UNIVERSITARIA = 18;

    private String nombre;
    private int edad;
    private double calificacion;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public boolean aprobo() {
        return calificacion >= APROBADO;
    }

    public int edadEscolar() {
        return edad / EDAD_ESCOLAR;
    }

    public boolean esUniversitario() {
        return edad >= EDAD_UNIVERSITARIA;
    }

    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}
