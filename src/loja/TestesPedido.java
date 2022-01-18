package loja;

import loja.pedido.EnviarEmailPedido;
import loja.pedido.GerarPedido;
import loja.pedido.GerarPedidoHandler;
import loja.pedido.SalvarPedidoNoBD;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedido {

    public static void main(String[] args){
        String cliente = "Gabriela Lima";
        BigDecimal valorOrcamento =  new BigDecimal("300");
        int qntItens = Integer.parseInt("2");

        GerarPedido gerador = new GerarPedido(cliente, valorOrcamento, qntItens);
        GerarPedidoHandler gerarPedidoHandler = new GerarPedidoHandler(Arrays.asList(new SalvarPedidoNoBD(), new EnviarEmailPedido()));
        gerarPedidoHandler.executa(gerador);
    }
}
