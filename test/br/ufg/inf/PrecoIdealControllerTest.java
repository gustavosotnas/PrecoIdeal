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
        double expResult = 1.6;
        assertEquals(expResult, result, 0.1);
    }

    /**
     * Cálculo de variação de preço
     * Caso de exemplo: calças jeans
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
    public void testCalculaRazaoIdeal() {
        double elasticidade = 1.6;
        double pa = 8;
        double qa = 4;

        double result = PrecoIdealController.calculaRazaoIdeal(elasticidade, pa, qa);

        double pf = 10;
        double qf = 3;
        double expResult = (pf/qf);
        assertEquals(expResult, result, 0.1);
    }
}
