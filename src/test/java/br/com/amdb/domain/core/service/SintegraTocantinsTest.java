package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraTocantinsTest {

    @Test
    public void deveValidarSintegra() {
        SintegraTocantins sintegra = new SintegraTocantins();
        assertTrue(sintegra.validar("77039628063"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraTocantins sintegra = new SintegraTocantins();
        assertFalse(sintegra.validar("29010227837"));
    }
}