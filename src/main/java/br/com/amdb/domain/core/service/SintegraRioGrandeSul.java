package br.com.amdb.domain.core.service;

public class SintegraRioGrandeSul extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 10)
            return false;

        String[] strArray = sintegra.split("");
        long b = 2, soma = 0, dig = 0;

        for (int i = 0; i <= 8; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b --;
            if (b == 1)
                b = 9;
        }

        dig = 11 - (soma % 11);

        if (dig >= 10)
            dig = 0;

        return (dig == Long.valueOf(strArray[9]).longValue());
    }
}
