package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraMaranhaoTest {

    @Test
    public void deveValidarSintegra() {
        SintegraMaranhao sintegra = new SintegraMaranhao();
        assertTrue(sintegra.validar("120000385"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraMaranhao sintegra = new SintegraMaranhao();
        assertFalse(sintegra.validar("120000389"));
    }
}