package com.cicd.webapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {

    @Test
    void testHolaMundo() {
        String mensaje = "Hola Mundo CI/CD";
        Assertions.assertEquals("Hola Mundo CI/CD", mensaje);
    }
}