package br.com.amdb.domain.core.service;

public class SintegraRoraima extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 9)
            return false;

        if (!sintegra.substring(0,2).equals("24"))
            return false;

        String[] strArray = sintegra.split("");
        long b = 1, soma = 0, dig = 0;

        for (int i = 0; i <= 7; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b ++;
        }

        dig = soma % 9;

        return (dig == Long.valueOf(strArray[8]).longValue());
    }
}
