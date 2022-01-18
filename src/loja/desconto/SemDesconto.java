package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }

    public BigDecimal calculaDesconto(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    @Override
    public boolean verificaDesconto(Orcamento orcamento) {
        return true;
    }
}
