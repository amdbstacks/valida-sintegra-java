package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraRoraimaTest {

    @Test
    public void deveValidarSintegra() {
        SintegraRoraima sintegra= new SintegraRoraima();
        assertTrue(sintegra.validar("240066281"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraRoraima sintegra = new SintegraRoraima();
        assertFalse(sintegra.validar("240066289"));
    }
}