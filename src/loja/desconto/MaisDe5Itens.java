package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class MaisDe5Itens extends Desconto {

    public MaisDe5Itens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcula(Orcamento orcamento){
        if (orcamento.getQuantidadeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcula(orcamento);
    }
}
