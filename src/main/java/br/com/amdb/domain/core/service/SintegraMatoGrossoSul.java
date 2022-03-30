package br.com.amdb.domain.core.service;

public class SintegraMatoGrossoSul extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 9)
            return false;
        
        if (!sintegra.substring(0,2).equals("28"))
            return false;
        
        String[] strArray = sintegra.split("");
        long b = 9, soma = 0, dig = 0, r = 0;

        for (int i = 0; i <= 7; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b --;
        }

        r = soma % 11;

        if (r == 0) {
            dig = 0;
        } else {
            dig = 11 - r;
        }

        if (dig > 9)
            dig = 0;

        return (dig == Long.valueOf(strArray[8]).longValue());
    }
}
