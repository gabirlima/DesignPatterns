package loja.orcamento.situacao;

import loja.orcamento.Orcamento;
import loja.situacao.DomainException;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {
//pattern State - https://refactoring.guru/design-patterns/state
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado!");
    }
    public void reprovar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

    public void finalizar(Orcamento orcamento){
        throw new DomainException("Orçamento não pode ser aprovado!");
    }

}
