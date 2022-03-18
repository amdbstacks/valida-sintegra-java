package br.com.amdb.domain.core.service;

public class SintegraAlagoas {

    public boolean validar(String sintegra) {
        if (sintegra.length() != 9)
            return false;

        if (!sintegra.substring(0,2).equals("24"))
            return false;

        String[] strArray = sintegra.split("");
        long b = 9;
        long soma = 0;
        long dig = 0;

        for (int i = 0; i<=7; i++) {
            soma+= Long.valueOf(strArray[i]).longValue() * b;
            b--;
        }

        soma*=10;
        dig = soma - ((soma / 11)*11);

        if (dig == 10)
            dig = 0;

        return (dig == Long.valueOf(strArray[8]).longValue());
    }
}
