package br.com.amdb.domain.core;

import br.com.amdb.domain.enumeration.Estados;
import br.com.amdb.domain.exception.SintegraException;

import java.util.Objects;

public class ValidacaoSintegra {

    public boolean validar(String sintegra, Estados estados) {
        try {
            if (Objects.isNull(sintegra) || sintegra.isBlank())
                throw new SintegraException("Sintegra não informada!");

            if (Objects.isNull(estados))
                throw new SintegraException("Estado não informado!");

            return false;
        }catch (Throwable t) {
            throw t;
        }
    }
}
