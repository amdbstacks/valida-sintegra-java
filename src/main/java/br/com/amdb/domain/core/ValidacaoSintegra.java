package br.com.amdb.domain.core;

import br.com.amdb.domain.core.service.*;
import br.com.amdb.domain.enumeration.Estados;
import br.com.amdb.domain.exception.SintegraException;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ValidacaoSintegra {

    public boolean validar(String sintegra, Estados estados) {
        try {
            if (Objects.isNull(sintegra) || sintegra.isBlank())
                throw new SintegraException("Sintegra não informada!");

            if (Objects.isNull(estados))
                throw new SintegraException("Estado não informado!");

            if (!StringUtils.isNumeric(sintegra))
                throw new SintegraException("Sintegra não numerica!");

            Validacao validacao = (Validacao) validadores().get(estados.getName());

            return validacao.validar(sintegra);
        }catch (Throwable t) {
            throw t;
        }
    }

    private <T> Map<String, T> validadores() {
        Map<String, T> map = new HashMap<>();

        map.put(Estados.AC.getName(), (T) new SintegraAcre());
        map.put(Estados.AL.getName(), (T) new SintegraAlagoas());
        map.put(Estados.AP.getName(), (T) new SintegraAmapa());
        map.put(Estados.AM.getName(), (T) new SintegraAmazonas());
        map.put(Estados.BA.getName(), (T) new SintegraBahia());
        map.put(Estados.CE.getName(), (T) new SintegraCeara());
        map.put(Estados.DF.getName(), (T) new SintegraDF());
        map.put(Estados.ES.getName(), (T) new SintegraES());
        map.put(Estados.GO.getName(), (T) new SintegraGoias());
        map.put(Estados.MA.getName(), (T) new SintegraMaranhao());
        map.put(Estados.MT.getName(), (T) new SintegraMatoGrosso());
        map.put(Estados.MS.getName(), (T) new SintegraMatoGrossoSul());
        map.put(Estados.MG.getName(), (T) new SintegraMG());
        map.put(Estados.PA.getName(), (T) new SintegraPara());
        map.put(Estados.PB.getName(), (T) new SintegraParaiba());
        map.put(Estados.PR.getName(), (T) new SintegraParana());
        map.put(Estados.PE.getName(), (T) new SintegraPernambuco());
        map.put(Estados.PI.getName(), (T) new SintegraPiaui());
        map.put(Estados.RN.getName(), (T) new SintegraRioGrandeNorte());
        map.put(Estados.RS.getName(), (T) new SintegraRioGrandeSul());
        map.put(Estados.RJ.getName(), (T) new SintegraRJ());
        map.put(Estados.RO.getName(), (T) new SintegraRondonia());
        map.put(Estados.RR.getName(), (T) new SintegraRoraima());
        map.put(Estados.SC.getName(), (T) new SintegraSC());
        map.put(Estados.SE.getName(), (T) new SintegraSergipe());
        map.put(Estados.SP.getName(), (T) new SintegraSP());
        map.put(Estados.TO.getName(), (T) new SintegraTocantins());

        return map;
    }
}
