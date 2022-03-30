package br.com.amdb.domain.core.service;

public class SintegraAmapa extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 9)
            return false;

        if (!sintegra.substring(0,2).equals("03"))
            return false;

        long i = Long.valueOf(sintegra.substring(0, sintegra.length()-1)).longValue();
        String[] strArray = sintegra.split("");
        long b = 9;
        long soma = 0, dig = 0, p = 0, d = 0;

        if ((i >= 3000001) && (i <=3017000)) {
            p =5;
            d = 0;
        } else if ((i >= 3017001) && (i <= 3019022)) {
            p = 9;
            d = 1;
        } else if (i >= 3019023) {
            p = 0;
            d = 0;
        }

        soma = p;

        for (int o = 0; o <= 7; o++) {
            soma+= Long.valueOf(strArray[o]).longValue() * b;
            b--;
        }

        dig = 11 - (soma % 11);

        if (dig == 10) {
            dig = 0;
        } else if (dig == 11) {
            dig = d;
        }

        return (dig == Long.valueOf(strArray[8]).longValue());
    }
}
