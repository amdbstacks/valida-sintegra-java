package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraPiauiTest {

    @Test
    public void deveValidarSintegra() {
        SintegraPiaui sintegra= new SintegraPiaui();
        assertTrue(sintegra.validar("012345679"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraPiaui sintegra = new SintegraPiaui();
        assertFalse(sintegra.validar("012345674"));
    }
}