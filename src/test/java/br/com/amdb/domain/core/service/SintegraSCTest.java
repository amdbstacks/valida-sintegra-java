package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraSCTest {

    @Test
    public void deveValidarSintegra() {
        SintegraSC sintegra= new SintegraSC();
        assertTrue(sintegra.validar("251040852"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraSC sintegra = new SintegraSC();
        assertFalse(sintegra.validar("251040858"));
    }
}