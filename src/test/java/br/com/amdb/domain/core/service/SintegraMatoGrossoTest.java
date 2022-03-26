package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SintegraMatoGrossoTest {

    @Test
    public void deveValidarSintegra() {
        SintegraMatoGrosso sintegra = new SintegraMatoGrosso();
        assertTrue(sintegra.validar("00130000019"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraMatoGrosso sintegra = new SintegraMatoGrosso();
        assertFalse(sintegra.validar("00130000012"));
    }
}