package loja.pedido;

import loja.orcamento.Orcamento;

import java.time.LocalDateTime;
import java.util.List;

public class GerarPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GerarPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GerarPedido dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);
        System.out.println("Pedido criado com sucesso!");
        acoes.forEach(a -> a.executar(pedido));
    }
}
