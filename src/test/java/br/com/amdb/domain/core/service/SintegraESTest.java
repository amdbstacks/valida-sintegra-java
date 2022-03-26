package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraESTest {

    @Test
    public void deveValidarSintegra() {
        SintegraES sintegra = new SintegraES();
        assertTrue(sintegra.validar("999999990"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraES sintegra = new SintegraES();
        assertFalse(sintegra.validar("999999997"));
    }
}