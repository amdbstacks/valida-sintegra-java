package br.com.amdb.domain.core.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class SintegraMG extends Validacao{

    @Override
    public boolean validar(String sintegra) {
        if (sintegra.length() != 13)
            return false;

        String[] strArray = sintegra.split("");
        long b = 1, soma = 0, dig = 0, num = 0, r = 0;
        String ie2 = sintegra.substring(0,3).concat("0".concat(sintegra.substring(3)));
        StringBuilder c = new StringBuilder();
        String[] arrayIe2 = ie2.split("");
        List<BigDecimal> s = new ArrayList<>();

        for (int i = 0; i <= 11; i++) {
            c.append(String.valueOf(Long.valueOf(arrayIe2[i]).longValue() * b));
            b ++;

            if (b == 3)
                b = 1;
        }

        String[] arrayC = c.toString().split("");
        for (int i = 0; i < c.length(); i ++) {
            s.add(BigDecimal.valueOf(Long.valueOf(arrayC[i]).longValue()));
        }

        BigDecimal g = s.stream().reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal d = g.divide(BigDecimal.valueOf(10), RoundingMode.UP)
                .multiply(BigDecimal.valueOf(10l));

        num = d.longValue();

        dig = num - g.longValue();

        if (dig != Long.valueOf(strArray[11]).longValue())
            return false;

        b = 3;

        for (int i = 0; i <= 11; i++) {
            soma += Long.valueOf(strArray[i]).longValue() * b;
            b --;
            if (b == 1)
                b = 11;
        }

        r = soma % 11;

        if (r < 2) {
            dig = 0;
        } else {
            dig = 11 - r;
        }

        return (dig == Long.valueOf(strArray[12]).longValue());
    }
}
