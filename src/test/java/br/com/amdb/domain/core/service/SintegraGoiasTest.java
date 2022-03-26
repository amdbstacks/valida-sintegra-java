package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraGoiasTest {

    @Test
    public void deveValidarSintegra() {
        SintegraGoias sintegra = new SintegraGoias();
        assertTrue(sintegra.validar("109876547"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraGoias sintegra = new SintegraGoias();
        assertFalse(sintegra.validar("109876548"));
    }
}