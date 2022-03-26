package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraMGTest {

    @Test
    public void deveValidarSintegra() {
        SintegraMG sintegra= new SintegraMG();
        assertTrue(sintegra.validar("0623079040081"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraMG sintegra = new SintegraMG();
        assertFalse(sintegra.validar("0623079040089"));
    }
}