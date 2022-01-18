package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
//pattern Strategy - https://refactoring.guru/design-patterns/strategy
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcula(orcamento);
    }
}
