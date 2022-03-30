package br.com.amdb.domain.core.service;

public class SintegraRioGrandeNorte extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        int b = sintegra.length();

        if (!((b == 9) || (b == 10)))
            return false;

        long soma = 0, dig = 0;
        int s = 0;
        String[] strArray = sintegra.split("");

        if (b == 9) {
            s = 7;
        } else {
            s = 8;
        }

        soma = 0;
        for (int i = 0; i <= s; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b--;
        }

        soma *= 10;
        dig = soma % 11;

        if (dig == 10)
            dig = 0;

        s += 1;
        return (dig == Long.valueOf(strArray[s]).longValue());
    }
}
