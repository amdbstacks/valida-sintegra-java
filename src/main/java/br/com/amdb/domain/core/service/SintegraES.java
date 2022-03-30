package br.com.amdb.domain.core.service;

public class SintegraES extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 9)
            return false;

        long b = 9, soma = 0, dig = 0, r = 0;
        String[] strArray = sintegra.split("");

        for (int i = 0; i <= 7; i ++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b --;
        }

        r = soma % 11;

        if (r < 2) {
            dig = 0;
        } else {
            dig = 11 - r;
        }

        return (dig == Long.valueOf(strArray[8]).longValue());
    }
}
