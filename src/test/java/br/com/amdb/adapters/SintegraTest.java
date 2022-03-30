package br.com.amdb.adapters;

import br.com.amdb.domain.enumeration.Estados;
import br.com.amdb.domain.exception.SintegraException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SintegraTest {

    @Test
    public void deveValidarSintegraAcre() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("0100482300112", Estados.AC);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("0100482300113", Estados.AC);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraAlagoas() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("240000048", Estados.AL);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("240000049", Estados.AL);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraAmapa() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("030123459", Estados.AP);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("030123450", Estados.AP);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraAmazonas() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("999999990", Estados.AM);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("999999999", Estados.AM);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraBahia() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("12345663", Estados.BA);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("12345664", Estados.BA);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraCeara() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("060000015", Estados.CE);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("060000016", Estados.CE);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraDF() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("0730000100109", Estados.DF);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("0730000100108", Estados.DF);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraES() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("999999990", Estados.ES);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("999999994", Estados.ES);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraGoias() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("109876547", Estados.GO);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("109876548", Estados.GO);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraMaranhao() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("120000385", Estados.MA);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("120000386", Estados.MA);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraMatoGrosso() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("00130000019", Estados.MT);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("00130000016", Estados.MT);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraMatoGrossoSul() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("283115947", Estados.MS);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("283115949", Estados.MS);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraMG() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("0623079040081", Estados.MG);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("0623079040085", Estados.MG);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraPara() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("159999995", Estados.PA);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("159999996", Estados.PA);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraParaiba() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("060000015", Estados.PB);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("060000016", Estados.PB);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraParana() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("1234567850", Estados.PR);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("1234567851", Estados.PR);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraPernambuco1() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("032141840", Estados.PE);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("032141843", Estados.PE);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraPernambuco2() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("18100100000049", Estados.PE);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("18100100000048", Estados.PE);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraPiaui() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("012345679", Estados.PI);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("012345678", Estados.PI);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraRJ() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("99999993", Estados.RJ);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("99999996", Estados.RJ);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraRioGrandeNorte1() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("200400401", Estados.RN);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("200400402", Estados.RN);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraRioGrandeNorte2() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("2000400400", Estados.RN);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("2000400401", Estados.RN);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraRioGrandeSul() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("2243658792", Estados.RS);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("2243658793", Estados.RS);
        assertFalse(validacao2);
    }

    /**
     * @test
     */
    public void deveValidarSintegraRondonia1() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("101625213", Estados.RO);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("101625214", Estados.RO);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraRondonia2() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("00000000625213", Estados.RO);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("00000000625214", Estados.RO);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraRoraima() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("240066281", Estados.RR);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("240066282", Estados.RR);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraSC() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("251040852", Estados.SC);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("251040854", Estados.SC);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraSP() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("110042490114", Estados.SP);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("110042490115", Estados.SP);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraSergipe() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("271234563", Estados.SE);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("271234564", Estados.SE);
        assertFalse(validacao2);
    }

    @Test
    public void deveValidarSintegraTocantins() {
        Sintegra sintegra = new Sintegra();
        boolean  validacao1 = sintegra.validar("29010227836", Estados.TO);
        assertTrue(validacao1);

        boolean  validacao2 = sintegra.validar("29010227835", Estados.TO);
        assertFalse(validacao2);
    }

    @Test
    public void deveGerarExcecaoPorSintegraNula() {
        SintegraException e = assertThrows(SintegraException.class,
                ()->new Sintegra().validar(null, null));
        assertEquals("Sintegra não informada!", e.getMessage());
    }

    @Test
    public void deveGerarExcecaoPorSintegraVazia() {
        SintegraException e = assertThrows(SintegraException.class,
                ()->new Sintegra().validar("", null));
        assertEquals("Sintegra não informada!", e.getMessage());
    }

    @Test
    public void deveGerarExcecaoPorEstadoNulo() {
        SintegraException e = assertThrows(SintegraException.class,
                ()->new Sintegra().validar("123456789", null));
        assertEquals("Estado não informado!", e.getMessage());
    }

    @Test
    public void deveGerarExcecaoPorSintegraNaoNumerica() {
        SintegraException e = assertThrows(SintegraException.class,
                ()->new Sintegra().validar("898.735.154.947", Estados.SP));
        assertEquals("Sintegra não numerica!", e.getMessage());
    }


}