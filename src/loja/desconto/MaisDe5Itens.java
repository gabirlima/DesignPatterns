package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class MaisDe5Itens extends Desconto {

    public MaisDe5Itens(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calculaDesconto(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean verificaDesconto(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
