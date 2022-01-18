package loja.desconto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }
//pattern Template Method - https://refactoring.guru/design-patterns/template-method
    public BigDecimal calcula(Orcamento orcamento){
        if(verificaDesconto(orcamento)){
            return calculaDesconto(orcamento);
        }

        return proximo.calcula(orcamento);
    }
    public abstract BigDecimal calculaDesconto(Orcamento orcamento);
    public abstract boolean verificaDesconto(Orcamento orcamento);

}
