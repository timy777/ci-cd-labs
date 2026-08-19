package com.cicd.webapi;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class SimpleTest {
    
    @Test
    void testHolaMundo() {
        String mensaje = "Hola Mundo CI/CD";
        assertEquals("Hola Mundo CI/CD", mensaje);
    }
}
