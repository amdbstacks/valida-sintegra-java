package br.com.amdb.domain.core.service;

public class SintegraRondonia extends Validacao{

    @Override
    public boolean validar(String sintegra) {

        String[] strArray = sintegra.split("");
        long b = 6, soma = 0, dig = 0;

        if (sintegra.length() == 9) {
            for (int i = 3; i <= 7; i++) {
                soma += Long.valueOf(strArray[i]).longValue() * b;
                b--;
            }

            dig = 11 - (soma % 11);
            if (dig >= 10)
                dig = dig - 10;

            return (dig == Long.valueOf(strArray[8]).longValue());
        }

        if (sintegra.length() == 14) {
            for (int i = 0; i <= 12; i++) {
                soma += Long.valueOf(strArray[i]).longValue() * b;
                b--;
                if (b == 1)
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
