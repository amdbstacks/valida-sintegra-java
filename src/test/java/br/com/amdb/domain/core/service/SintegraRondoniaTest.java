package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraRondoniaTest {

    @Test
    public void deveValidarSintegra() {
        SintegraRondonia sintegra= new SintegraRondonia();
        assertTrue(sintegra.validar("101625213"));
        assertTrue(sintegra.validar("00000000625213"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraRondonia sintegra = new SintegraRondonia();
        assertFalse(sintegra.validar("101625218"));
        assertFalse(sintegra.validar("00000000625219"));
    }
}