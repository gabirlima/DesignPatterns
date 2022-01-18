package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDesconto {
// patern Chain of Responsability
    public BigDecimal calcular(Orcamento orcamento){
        Desconto desconto = new MaisDe5Itens(
                new ValorMaiorQue500(
                        new SemDesconto()));

        return desconto.calcula(orcamento);
    }
}
