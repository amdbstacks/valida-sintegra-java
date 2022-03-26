package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraBahiaTest {

    @Test
    public void deveValidarSintegra() {
        SintegraBahia sintegra = new SintegraBahia();
        assertTrue(sintegra.validar("12345663"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraBahia sintegra = new SintegraBahia();
        assertFalse(sintegra.validar("12345664"));
    }
}