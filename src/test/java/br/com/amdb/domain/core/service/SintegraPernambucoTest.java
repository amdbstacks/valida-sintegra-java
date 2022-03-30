package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraPernambucoTest {

    @Test
    public void deveValidarSintegra() {
        SintegraPernambuco sintegra = new SintegraPernambuco();
        assertTrue(sintegra.validar("032141840"));
        assertTrue(sintegra.validar("18100100000049"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraPernambuco sintegra = new SintegraPernambuco();
        assertFalse(sintegra.validar("032141841"));
        assertFalse(sintegra.validar("18100100000048"));
    }
}