package com.xulioxesus;

/**
 * La clase Circulo representa un círculo en un plano cartesiano.
 * Proporciona métodos para establecer y obtener sus coordenadas y radio,
 * así como cálculos de diámetro, circunferencia y área.
 *
 * @author vagrant
 */
public class Circulo {
    private int x; // Coordenada x del centro del círculo
    private int y; // Coordenada y del centro del círculo
    private double radio; // Radio del círculo

    /**
     * Constructor que inicializa un círculo con los valores proporcionados.
     *
     * @param valorX    Coordenada x del centro del círculo
     * @param valorY    Coordenada y del centro del círculo
     * @param valorRadio Radio del círculo (no puede ser negativo, en ese caso se asigna 0.0)
     */
    public Circulo(int valorX, int valorY, double valorRadio) {
        establecerX(valorX);
        establecerY(valorY);
        establecerRadio(valorRadio);
    }

    /**
     * Establece la coordenada x del centro del círculo.
     *
     * @param valorX Nueva coordenada x
     */
    public void establecerX(int valorX) {
        x = valorX;
    }

    /**
     * Obtiene la coordenada x del centro del círculo.
     *
     * @return Coordenada x
     */
    public int obtenerX() {
        return x;
    }

    /**
     * Establece la coordenada y del centro del círculo.
     *
     * @param valorY Nueva coordenada y
     */
    public void establecerY(int valorY) {
        y = valorY;
    }

    /**
     * Obtiene la coordenada y del centro del círculo.
     *
     * @return Coordenada y
     */
    public int obtenerY() {
        return y;
    }

    /**
     * Establece el radio del círculo. Si el valor es negativo, se asigna 0.0.
     *
     * @param valorRadio Nuevo valor del radio
     */
    public void establecerRadio(double valorRadio) {
        radio = valorRadio < 0.0 ? 0.0 : valorRadio;
    }

    /**
     * Obtiene el radio del círculo.
     *
     * @return Radio del círculo
     */
    public double obtenerRadio() {
        return radio;
    }

    /**
     * Calcula y devuelve el diámetro del círculo.
     *
     * @return Diámetro del círculo
     */
    public double obtenerDiametro() {
        return radio * 2;
    }

    /**
     * Calcula y devuelve la circunferencia del círculo.
     *
     * @return Circunferencia del círculo
     */
    public double obtenerCircunferencia() {
        return Math.PI * obtenerDiametro();
    }

    /**[ERROR] error: No public or protected classes found to document.
     * Calcula y devuelve el área del círculo.
     *
     * @return Área del círculo
     */
    public double obtenerArea() {
        return Math.PI * radio * radio;
    }

    /**
     * {@inheritDoc}
     *
     * Devuelve una representación en cadena del círculo.
     */
    @Override
    public String toString() {
        return "Centro  = [" + x + "," + y + "]; Radio = " + radio;
    }
}
