package br.com.amdb.domain.core.service;

public class SintegraPernambuco extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        long b = 0, soma = 0, dig = 0, r = 0;
        String[] strArray = sintegra.split("");

        if (sintegra.length() == 9) {
            b = 8;
            soma = 0;
            for (int i = 0; i <= 6; i++) {
                soma += Long.valueOf(strArray[i]).longValue() * b;
                b--;
            }
            r = soma % 11;
            if (r <= 1) {
                dig = 0;
            } else {
                dig = 11 - r;
            }

            if (!(dig == Long.valueOf(strArray[7]).longValue()))
                return false;

            b = 9;
            soma = 0;
            for (int i = 0; i <= 7; i++) {
                soma += Long.valueOf(strArray[i]).longValue() * b;
                b--;
            }

            r = soma % 11;
            if (r <= 1) {
                dig = 0;
            } else {
                dig = 11 - r;
            }

            return (dig == Long.valueOf(strArray[8]).longValue());
        }

        if (sintegra.length() == 14) {
            b = 5;
            soma = 0;
            for (int i = 0; i <= 12; i++) {
                soma += Long.valueOf(strArray[i]).longValue() * b;
                b--;
                if (b == 0)
                    b = 9;
            }

            dig = 11 - (soma % 11);
            if (dig > 9)
                dig = dig - 10;

            return (dig == Long.valueOf(strArray[13]).longValue());
        }

        return false;
    }
}
