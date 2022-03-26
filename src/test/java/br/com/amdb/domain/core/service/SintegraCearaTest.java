package br.com.amdb.domain.core.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SintegraCearaTest {

    @Test
    public void deveValidarSintegra() {
        SintegraCeara sintegra = new SintegraCeara();
        assertTrue(sintegra.validar("060000015"));
    }

    @Test
    public void naoDeveValidarSintegra() {
        SintegraCeara sintegra = new SintegraCeara();
        assertFalse(sintegra.validar("060000018"));
    }
}
