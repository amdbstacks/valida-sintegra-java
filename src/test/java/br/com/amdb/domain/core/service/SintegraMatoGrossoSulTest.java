package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraMatoGrossoSulTest {

    @Test
    public void deveValidarSintegra() {
        SintegraMatoGrossoSul sintegra = new SintegraMatoGrossoSul();
        assertTrue(sintegra.validar("283115947"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraMatoGrossoSul sintegra = new SintegraMatoGrossoSul();
        assertFalse(sintegra.validar("283115948"));
    }
}