package loja.pedido;

public class SalvarPedidoNoBD implements AcaoAposGerarPedido{

    public void executar(Pedido pedido){
        System.out.println("Salvando pedido no BD!");
    }
}
