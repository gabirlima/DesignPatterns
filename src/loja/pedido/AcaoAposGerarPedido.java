package loja.pedido;

public interface AcaoAposGerarPedido {
//Pattern Observer - https://refactoring.guru/design-patterns/observer
    public void executar(Pedido pedido);
}
