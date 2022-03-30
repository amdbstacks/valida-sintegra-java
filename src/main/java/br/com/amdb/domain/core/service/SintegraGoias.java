package br.com.amdb.domain.core.service;

public class SintegraGoias extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 9)
            return false;

        Integer s = Integer.valueOf(sintegra.substring(0,2));

        if (!((s == 10) || (s == 11) || (s == 15)))
            return false;

        Integer n = Integer.valueOf(sintegra.substring(0,7));
        String[] strArray = sintegra.split("");
        long b = 9, soma = 0, dig = 0, r = 0;

        if (n == 11094402) {
            if (Long.valueOf(strArray[8]).longValue() != 0) {
                if (Long.valueOf(strArray[8]).longValue() != 1) {
                    return false;
                } else {
                    return true;
                }
            } else {
                return false;
            }
        } else {
            for (int i = 0; i <= 7; i++) {
                soma += Long.valueOf(strArray[i]).longValue() * b;
                b --;
            }

            r = soma % 11;
            if (r == 0) {
                dig = 0;
            } else {
                if (r == 1) {
                    if ((n >= 10103105) && (n <= 10119997)) {
                        dig = 1;
                    } else {
                        dig = 0;
                    }
                } else {
                    dig = 11 - r;
                }
            }

            return (dig == Long.valueOf(strArray[8]).longValue());
        }
    }
}
