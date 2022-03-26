package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraDFTest {

    @Test
    public void deveValidarSintegra() {
        SintegraDF sintegra = new SintegraDF();
        assertTrue(sintegra.validar("0730000100109"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraDF sintegra = new SintegraDF();
        assertFalse(sintegra.validar("0730000100107"));
    }
}