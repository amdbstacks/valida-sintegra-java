package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraParanaTest {

    @Test
    public void deveValidarSintegra() {
        SintegraParana sintegra = new SintegraParana();
        assertTrue(sintegra.validar("1234567850"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraParana sintegra = new SintegraParana();
        assertFalse(sintegra.validar("1234567859"));
    }
}