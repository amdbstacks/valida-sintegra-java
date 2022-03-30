package br.com.amdb.domain.core.service;

public class SintegraSC extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 9)
            return false;

        String[] strArray = sintegra.split("");
        long b = 9, soma = 0, dig = 0;

        for (int i = 0; i <= 7; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b--;
        }

        dig = 11 - (soma % 11);

        if (dig <= 1)
            dig = 0;

        return (dig == Long.valueOf(strArray[8]).longValue());

    }
}
