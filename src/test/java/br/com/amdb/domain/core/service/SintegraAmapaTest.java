package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraAmapaTest {

    @Test
    public void deveValidarSintegra() {
        SintegraAmapa sintegra = new SintegraAmapa();
        assertTrue(sintegra.validar("030123459"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraAmapa sintegra = new SintegraAmapa();
        assertFalse(sintegra.validar("030123458"));
    }
}