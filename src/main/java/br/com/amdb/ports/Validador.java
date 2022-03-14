package br.com.amdb.ports;

import br.com.amdb.domain.enumeration.Estados;

public interface Validador {

    public boolean validar(String sintegra, Estados estados);
}
