package loja.pedido;

import loja.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GerarPedidoHandler {

    //construtor com injecao de dependencias: repository, service, etc

    public void executa(GerarPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Pedido criado com sucesso!");
    }
}
