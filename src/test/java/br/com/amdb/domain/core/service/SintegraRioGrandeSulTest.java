package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraRioGrandeSulTest {

    @Test
    public void deveValidarSintegra() {
        SintegraRioGrandeSul sintegra= new SintegraRioGrandeSul();
        assertTrue(sintegra.validar("2243658792"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraRioGrandeSul sintegra = new SintegraRioGrandeSul();
        assertFalse(sintegra.validar("2243658798"));
    }
}