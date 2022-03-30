package br.com.amdb.domain.core.service;

public class SintegraSP extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        String[] strArray = sintegra.split("");
        long b = 0, soma = 0, dig = 0;

        if (sintegra.substring(0,1).equalsIgnoreCase("P")) {
            if (sintegra.length() != 13) {
                return false;
            } else {
                b = 1;
                soma = 0;
                for (int i = 1; i <= 8; i++) {
                    soma += Long.valueOf(strArray[i]).longValue() * b;
                    b++;
                    if (b == 2)
                        b = 3;

                    if (b == 9)
                        b = 10;
                }
                dig = soma % 11;
                return (dig == Long.valueOf(strArray[9]).longValue());
            }
        }

        if (sintegra.length() != 12)
            return false;

        b = 1;
        soma = 0;
        for (int i = 0; i <= 7; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b ++;
            if (b == 2)
                b = 3;

            if (b == 9)
                b = 10;
        }

        dig = soma % 11;

        if (dig > 9)
            dig = 0;

        if (dig != Long.valueOf(strArray[8]).longValue())
            return false;

        b = 3;
        soma = 0;
        for (int i = 0; i <= 10; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b--;
            if (b == 1)
                b = 10;
        }

        dig = soma % 11;

        return (dig == Long.valueOf(strArray[11]).longValue());
    }
}
