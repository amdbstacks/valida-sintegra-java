package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraParaibaTest {

    @Test
    public void deveValidarSintegra() {
        SintegraParaiba sintegra= new SintegraParaiba();
        assertTrue(sintegra.validar("060000015"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraParaiba sintegra = new SintegraParaiba();
        assertFalse(sintegra.validar("060000011"));
    }
}