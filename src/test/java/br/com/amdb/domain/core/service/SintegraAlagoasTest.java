package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraAlagoasTest {

    @Test
    public void deveValidarSintegra() {
        SintegraAlagoas sintegra = new SintegraAlagoas();
        assertTrue(sintegra.validar("240000048"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraAlagoas sintegra = new SintegraAlagoas();
        assertFalse(sintegra.validar("240000049"));
    }
}