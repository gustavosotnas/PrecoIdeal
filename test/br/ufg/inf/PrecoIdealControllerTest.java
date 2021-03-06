package br.ufg.inf;

import org.junit.Test;
import static org.junit.Assert.*;

public class PrecoIdealControllerTest {

    /**
     * Caso de exemplo: ingressos de cinema
     *
     * http://www2.anhembi.br/html/ead01/economia/lu04/lo2/index.htm
     */
    @Test
    public void testCalculaElasticidadeCinema() {
        double pa = 8;
        double pf = 10;
        double qa = 4;
        double qf = 3;
        double result = PrecoIdealController.calculaElasticidade(pa, pf, qa, qf);
        double expResult = -1.6666666666;
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Cálculo de variação de preço, caso de exemplo: calças jeans
     *
     * http://pt.wikihow.com/Calcular-a-Varia%C3%A7%C3%A3o-Percentual
     */
    @Test
    public void testCalculaVariacaoPreco() {
        double pa = 50;
        double pf = 30;

        double result = PrecoIdealController.calculaVariacaoPreco(pa, pf);
        double expResult = -40;
        assertEquals(expResult, result, 0.1);
    }

    @Test
    public void testCalculaQtdeIdealCinema() {
        double pa = 8;
        double pf = 10;
        double qa = 4;
        double qf = 3;

        double elasticidade = PrecoIdealController.calculaElasticidade(pa, pf, qa, qf);

        double result = PrecoIdealController.calculaQtdeIdealMensal(elasticidade, pa, pf, qa);
        assertEquals(qf, result, 0.1);
    }

    @Test
    public void testCalculaQtdeIdealFixoP50() {
        double pa = 4;
        double pf = 8;
        double qa = 4;

        double elasticidade = -1;

        double result = PrecoIdealController.calculaQtdeIdealMensal(elasticidade, pa, pf, qa);
        System.out.println("P50: " + result);
        //assertEquals(qf, result, 0.1);
    }

    @Test
    public void testCalculaQtdeIdealFixoM50() {
        double pa = 4;
        double pf = 8;
        double qa = 4;

        double elasticidade = -0.5;

        double result = PrecoIdealController.calculaQtdeIdealMensal(elasticidade, pa, pf, qa);
        System.out.println("M50: " + result);
        //assertEquals(qf, result, 0.1);
    }
}
