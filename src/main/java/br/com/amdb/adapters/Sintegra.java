package br.com.amdb.adapters;

import br.com.amdb.domain.enumeration.Estados;
import br.com.amdb.ports.Validador;

public class Sintegra implements Validador {

    @Override
    public boolean validar(String sintegra, Estados estados) {
        return false;
    }
}
