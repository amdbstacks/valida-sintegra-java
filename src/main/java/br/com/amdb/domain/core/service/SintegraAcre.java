package br.com.amdb.domain.core.service;

public class SintegraAcre extends Validacao {

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 13)
            return false;

        if (!sintegra.substring(0,2).equals("01"))
            return false;

        String[] strArray = sintegra.split("");
        long b = 4;
        long soma = 0, dig = 0, dv = 0;

        for (int i = 0; i <= 10; i++) {
            soma+= Long.valueOf(strArray[i]).longValue() * b;
            b--;
            if (b == 1)
                b = 9;
        }

        dig = 11 - (soma%11);

        if (dig>=10)
            dig = 0;

        dv  = Long.valueOf(strArray[11]).longValue();
        if (!(dig == dv))
            return false;

        b = 5;
        soma = 0;

        for (int i = 0; i<=11; i++){
            soma+= Long.valueOf(strArray[i]).longValue() * b;
            b--;
            if (b == 1)
                b = 9;
        }

        dig = 11 - (soma%11);

        if (dig>=10)
            dig = 0;

        return (dig == Long.valueOf(strArray[12]).longValue());
    }
}
