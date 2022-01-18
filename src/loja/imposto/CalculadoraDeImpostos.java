package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
//pattern Strategy
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcula(orcamento);
    }
}
