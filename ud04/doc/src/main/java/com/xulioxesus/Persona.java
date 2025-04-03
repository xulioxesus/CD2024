package com.xulioxesus;

/**
 * <p>Persona class.</p>
 *
 * @author vagrant
 */
public class Persona {

    private String nombre;
    private int edad;

    /**
     * <p>Constructor for Persona.</p>
     *
     * @param nombre a {@link java.lang.String} object
     * @param edad a int
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * <p>Getter for the field <code>nombre</code>.</p>
     *
     * @return a {@link java.lang.String} object
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * <p>Setter for the field <code>nombre</code>.</p>
     *
     * @param nombre a {@link Circulo} object
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * <p>Getter for the field <code>edad</code>.</p>
     *
     * @return a int
     */
    public int getEdad() {
        return edad;
    }

    /**
     * <p>Setter for the field <code>edad</code>.</p>
     *
     * @param edad a int
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * <p>imprimirDetalles.</p>
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
