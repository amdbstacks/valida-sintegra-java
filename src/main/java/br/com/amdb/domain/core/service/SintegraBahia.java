package br.com.amdb.domain.core.service;

import java.util.Arrays;

public class SintegraBahia {

    public boolean validar(String sintegra) {
        if (sintegra.length() != 8)
            return false;

        Integer[] arr1 = {0, 1, 2, 3, 4, 5, 8};
        Integer[] arr2 = {6, 7, 9};
        int modulo = 0;
        long b = 7, soma = 0, r = 0, dig = 0;
        final Integer i = Integer.valueOf(sintegra.substring(0, 1));
        String[] strArray = sintegra.split("");

        boolean mod10 = Arrays.stream(arr1).anyMatch(m->{
            return m.equals(i);
        });

        boolean mod11 = Arrays.stream(arr2).anyMatch(m->{
            return m.equals(i);
        });

        if (mod10)
            modulo = 10;

        if (mod11)
            modulo = 11;

        for (int o = 0; o <= 5; o++) {
            soma += Long.valueOf(strArray[o]).longValue() * b;
            b--;
        }

        r = soma % modulo;

        if (modulo == 10) {
            if (r == 0) {
                dig = 0;
            } else {
                dig = modulo - r;
            }
        } else {
            if (r <= 1) {
                dig = 0;
            } else {
                dig = modulo - r;
            }
        }

        if (!(dig == Long.valueOf(strArray[7]).longValue()))
            return false;

        b = 8;
        soma = 0;
        for (int u = 0; u <= 5; u++) {
            soma += Long.valueOf(strArray[u]).longValue() * b;
            b--;
        }

        soma += Long.valueOf(strArray[7]).longValue() * 2;

        r = soma % modulo;

        if (modulo == 10) {
            if (r == 0) {
                r = 0;
            } else {
                dig = modulo - r;
            }
        } else {
            if (r <= 1) {
                dig = 0;
            } else {
                dig = modulo - r;
            }
        }

        return (dig == Long.valueOf(strArray[6]).longValue());
    }
}
