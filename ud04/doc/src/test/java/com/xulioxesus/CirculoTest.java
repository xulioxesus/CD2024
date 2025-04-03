package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Circulo.
 */
class CirculoTest {
    private Circulo circulo;

    @BeforeEach
    void setUp() {
        circulo = new Circulo(5, 10, 3.0);
    }

    @Test
    void testConstructor() {
        assertEquals(5, circulo.obtenerX());
        assertEquals(10, circulo.obtenerY());
        assertEquals(3.0, circulo.obtenerRadio(), 0.0001);
    }

    @Test
    void testEstablecerYObtenerX() {
        circulo.establecerX(8);
        assertEquals(8, circulo.obtenerX());
    }

    @Test
    void testEstablecerYObtenerY() {
        circulo.establecerY(15);
        assertEquals(15, circulo.obtenerY());
    }

    @Test
    void testEstablecerYObtenerRadio() {
        circulo.establecerRadio(5.5);
        assertEquals(5.5, circulo.obtenerRadio(), 0.0001);
    }

    @Test
    void testEstablecerRadioNegativoDebeSerCero() {
        circulo.establecerRadio(-2.0);
        assertEquals(0.0, circulo.obtenerRadio(), 0.0001);
    }

    @Test
    void testObtenerDiametro() {
        assertEquals(6.0, circulo.obtenerDiametro(), 0.0001);
    }

    @Test
    void testObtenerCircunferencia() {
        assertEquals(Math.PI * 6.0, circulo.obtenerCircunferencia(), 0.0001);
    }

    @Test
    void testObtenerArea() {
        assertEquals(Math.PI * 9.0, circulo.obtenerArea(), 0.0001);
    }

    @Test
    void testToString() {
        assertEquals("Centro  = [5,10]; Radio = 3.0", circulo.toString());
    }
}