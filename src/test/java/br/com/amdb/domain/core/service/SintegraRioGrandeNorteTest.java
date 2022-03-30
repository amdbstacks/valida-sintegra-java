package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraRioGrandeNorteTest {

    @Test
    public void deveValidarSintegra() {
        SintegraRioGrandeNorte sintegra= new SintegraRioGrandeNorte();
        assertTrue(sintegra.validar("2000400400"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraRioGrandeNorte sintegra = new SintegraRioGrandeNorte();
        assertFalse(sintegra.validar("2000400408"));
    }
}