package br.com.amdb.adapters;

import br.com.amdb.domain.core.ValidacaoSintegra;
import br.com.amdb.domain.enumeration.Estados;
import br.com.amdb.ports.Validador;

public class Sintegra implements Validador {

    private final ValidacaoSintegra validacaoSintegra;

    public Sintegra() {
        this.validacaoSintegra = new ValidacaoSintegra();
    }

    @Override
    public boolean validar(String sintegra, Estados estados) {
        return this.validacaoSintegra.validar(sintegra, estados);
    }
}
