package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ValorMaiorQue500 extends Desconto{

    public ValorMaiorQue500(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcula(Orcamento orcamento){
        if(orcamento.getValor().compareTo(new BigDecimal("500")) > 0){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }
        return proximo.calcula(orcamento);
    }
}
