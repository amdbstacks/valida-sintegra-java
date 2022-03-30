package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraSPTest {

    @Test
    public void deveValidarSintegra() {
        SintegraSP sintegra= new SintegraSP();
        assertTrue(sintegra.validar("478670596901"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraSP sintegra = new SintegraSP();
        assertFalse(sintegra.validar("110042490118"));
    }
}