package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraAmazonasTest {

    @Test
    public void deveValidarSintegra() {
        SintegraAmazonas sintegra = new SintegraAmazonas();
        assertTrue(sintegra.validar("999999990"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraAmazonas sintegra = new SintegraAmazonas();
        assertFalse(sintegra.validar("999999999"));
    }
}