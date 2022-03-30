package br.com.amdb.domain.core.service;

public class SintegraRJ extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 8)
            return false;

        String[] strArray = sintegra.split("");
        long b = 2, soma = 0, dig = 0, r = 0;

        for (int i = 0; i <= 6; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b--;
            if (b == 1)
                b = 7;
        }

        r = soma % 11;

        if (r <= 1) {
            dig = 0;
        } else {
            dig = 11 - r;
        }

        return (dig == Long.valueOf(strArray[7]).longValue());
    }
}
