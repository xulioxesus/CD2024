package com.xulioxesus;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Pruebas unitarias para la clase Persona.
 */
class PersonaTest {
    private Persona persona;

    @BeforeEach
    void setUp() {
        persona = new Persona("Juan", 25);
    }

    @Test
    void testConstructor() {
        assertEquals("Juan", persona.getNombre());
        assertEquals(25, persona.getEdad());
    }

    @Test
    void testSetYGetNombre() {
        persona.setNombre("Maria");
        assertEquals("Maria", persona.getNombre());
    }

    @Test
    void testSetYGetEdad() {
        persona.setEdad(30);
        assertEquals(30, persona.getEdad());
    }

    @Test
    void testImprimirDetalles() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        
        persona.imprimirDetalles();
        
        System.setOut(System.out);
        
        String expectedOutput = "Nombre: Juan\nEdad: 25\n";
        assertEquals(expectedOutput, outContent.toString().replace("\r\n", "\n"));
    }
}
