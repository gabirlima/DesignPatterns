package loja.pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido{

    public void executar(Pedido pedido){
        System.out.println("Enviando e-mail do pedido!");
    }
}
