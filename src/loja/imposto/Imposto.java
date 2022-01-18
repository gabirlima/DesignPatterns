package loja.imposto;

import loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcula(Orcamento orcamento);
}
