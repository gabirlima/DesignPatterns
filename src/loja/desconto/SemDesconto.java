package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto{

    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcula(Orcamento orcamento){
        return BigDecimal.ZERO;
    }
}
