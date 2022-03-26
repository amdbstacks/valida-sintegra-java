package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraParaTest {

    @Test
    public void deveValidarSintegra() {
        SintegraPara sintegra= new SintegraPara();
        assertTrue(sintegra.validar("159999995"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraPara sintegra = new SintegraPara();
        assertFalse(sintegra.validar("159999992"));
    }
}