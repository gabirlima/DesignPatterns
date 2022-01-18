package loja;

import loja.pedido.GerarPedido;
import loja.pedido.GerarPedidoHandler;

import java.math.BigDecimal;

public class TestesPedido {

    public static void main(String[] args){
        String cliente = args[0];
        BigDecimal valorOrcamento =  new BigDecimal(args[1]);
        int qntItens = Integer.parseInt(args[2]);

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, qntItens);
        GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(/*dependencias*/);
        gerarPedidoHandler.executa(gerador);
    }
}
