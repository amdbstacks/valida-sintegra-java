package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraRJTest {

    @Test
    public void deveValidarSintegra() {
        SintegraRJ sintegra= new SintegraRJ();
        assertTrue(sintegra.validar("99999993"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraRJ sintegra = new SintegraRJ();
        assertFalse(sintegra.validar("99999999"));
    }
}