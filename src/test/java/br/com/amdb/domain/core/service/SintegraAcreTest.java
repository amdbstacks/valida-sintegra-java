package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraAcreTest {

    @Test
    public void deveValidarSintegra() {
        SintegraAcre sintegraAcre = new SintegraAcre();
        assertTrue(sintegraAcre.validar("0100482300112"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraAcre sintegraAcre = new SintegraAcre();
        assertFalse(sintegraAcre.validar("0100482300113"));
    }

}