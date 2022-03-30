package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraSergipeTest {

    @Test
    public void deveValidarSintegra() {
        SintegraSergipe sintegra= new SintegraSergipe();
        assertTrue(sintegra.validar("271234563"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraSergipe sintegra = new SintegraSergipe();
        assertFalse(sintegra.validar("271234569"));
    }
}