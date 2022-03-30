package br.com.amdb.domain.core.service;

public class SintegraAmazonas extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 9)
            return false;

        String[] strArray = sintegra.split("");
        long b = 9;
        long soma = 0, dig = 0, r = 0;

        for (int i = 0; i <= 7; i ++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b --;
        }

        if (soma <= 11) {
            dig = 11 - soma;
        } else {
            r = soma % 11;
            if (r <= 1) {
                dig = 0;
            } else {
                dig = 11 - r;
            }
        }

        return (dig == Long.valueOf(strArray[8]).longValue());
    }
}
