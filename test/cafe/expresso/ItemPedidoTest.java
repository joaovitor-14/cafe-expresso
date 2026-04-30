package cafe.expresso;

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemPedidoTest {

    @Test
    void deveCalcularSubtotalCorretamente() {
        Produto produto = new Produto("Cappuccino", 5.0);
        ItemPedido item = new ItemPedido(produto, 4);

        double subtotal = item.calcularSubtotal();

         assertEquals(20.0, subtotal);
    }

    @Test
    void deveLancarExcecaoParaQuantidadeZero() {
        Produto produto = new Produto("Cappuccino", 10.0);

        assertThrows(IllegalArgumentException.class, () -> {
            new ItemPedido(produto, 0);
        });
    }

    @Test
    void deveLancarExcecaoParaQuantidadeNegativa() {
        Produto produto = new Produto("Cappuccino", 2.0);

        assertThrows(IllegalArgumentException.class, () -> {
            new ItemPedido(produto, -3);
        });
    }

    @Test
    void gettersDevemRetornarValoresCorretos() {
        Produto produto = new Produto("Cappuccino", 3.5);
        ItemPedido item = new ItemPedido(produto, 2);

        assertEquals(produto, item.getProduto());
        assertEquals(2, item.getQuantidade());
    }
}
