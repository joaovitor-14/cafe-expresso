package cafe.expresso;

import org.junit.Test;
import static org.junit.Assert.*;

public class PedidoTest {

    @Test
    public void testPedidoIniciaComStatusPendente() {
        Pedido pedido = new Pedido();
        assertEquals(StatusPedido.PENDENTE, pedido.getStatus());
    }

    @Test
    public void testAdicionarItemAoPedido() {
        Pedido pedido = new Pedido();
        Produto p = new Produto("Cappuccino", 8.50);
        pedido.adicionarItem(p, 2);
        assertEquals(1, pedido.getItens().size());
    }

    @Test
    public void testCalcularTotalCorreto() {
        Pedido pedido = new Pedido();
        Produto p = new Produto("Cappuccino", 8.50);
        pedido.adicionarItem(p, 2);
        assertEquals(17.00, pedido.calcularTotal(), 0.001);
    }

    @Test
    public void testCalcularTotalComVariosItensDiferentes() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Produto("Cappuccino", 8.50), 2);
        pedido.adicionarItem(new Produto("Coxinha", 6.00), 3);
        assertEquals(35.00, pedido.calcularTotal(), 0.001);
    }

    @Test
    public void testPagarPedido() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Produto("Cappuccino", 8.50), 1);
        pedido.pagar();
        assertEquals(StatusPedido.PAGO, pedido.getStatus());
    }

    @Test
    public void testEnviarParaCozinha() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Produto("Cappuccino", 8.50), 1);
        pedido.pagar();
        pedido.enviarParaCozinha();
        assertEquals(StatusPedido.EM_PREPARO, pedido.getStatus());
    }

    @Test
    public void testFinalizarPedido() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Produto("Cappuccino", 8.50), 1);
        pedido.pagar();
        pedido.enviarParaCozinha();
        pedido.finalizarPedido();
        assertEquals(StatusPedido.FINALIZADO, pedido.getStatus());
    }

    @Test(expected = IllegalStateException.class)
    public void testPagarPedidoJaPagoDeveLancarExcecao() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Produto("Cappuccino", 8.50), 1);
        pedido.pagar();
        pedido.pagar();
    }

    @Test(expected = IllegalStateException.class)
    public void testEnviarParaCozinhaSemPagarDeveLancarExcecao() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Produto("Cappuccino", 8.50), 1);
        pedido.enviarParaCozinha();
    }

    @Test(expected = IllegalStateException.class)
    public void testFinalizarSemEnviarParaCozinhaDeveLancarExcecao() {
        Pedido pedido = new Pedido();
        pedido.adicionarItem(new Produto("Cappuccino", 8.50), 1);
        pedido.pagar();
        pedido.finalizarPedido();
    }
}