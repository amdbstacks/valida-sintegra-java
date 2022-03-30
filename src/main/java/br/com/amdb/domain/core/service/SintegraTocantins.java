package br.com.amdb.domain.core.service;

public class SintegraTocantins extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 11)
            return false;

        String s = sintegra.substring(2,4);

        if (!((s.equals("01")) || (s.equals("02")) || (s.equals("03")) || (s.equals("99"))))
            return false;

        long b = 9, soma = 0, dig = 0, r = 0;
        String[] strArray = sintegra.split("");

        for (int i = 0; i <= 9; i++) {
            if (!((i == 2) || (i == 3))) {
                soma += Long.valueOf(strArray[i]).longValue() * b;
                b--;
            }
        }

        r = soma % 11;

        if (r < 2) {
            dig = 0;
        } else {
            dig = 11 - r;
        }

        return (dig == Long.valueOf(strArray[10]).longValue());
    }
}
