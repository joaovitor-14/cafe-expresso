package cafe.expresso;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<ItemPedido> itens;
    private StatusPedido status;

    public Pedido() {
        this.itens = new ArrayList<>();
        this.status = StatusPedido.PENDENTE;
    }
    public void adicionarItem(Produto produto, int quantidade) {
        itens.add(new ItemPedido(produto, quantidade));
    }

    public double calcularTotal() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }
    public void pagar() {
        if (status != StatusPedido.PENDENTE) {
            throw new IllegalStateException("Pedido nao pode ser pago pois nao esta pendente");
        }
        this.status = StatusPedido.PAGO;
    }

    public void enviarParaCozinha() {
        if (status != StatusPedido.PAGO) {
            throw new IllegalStateException("Pedido nao pode ir para cozinha pois ainda nao foi pago");
        }
        this.status = StatusPedido.EM_PREPARO;
    }

    public void finalizarPedido() {
        if (status != StatusPedido.EM_PREPARO) {
            throw new IllegalStateException("Pedido nao pode ser finalizado pois ainda nao esta em preparo");
        }
        this.status = StatusPedido.FINALIZADO;
    }
}
