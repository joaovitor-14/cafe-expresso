package cafe.expresso;

import org.junit.Test;
import static org.junit.Assert.*;

public class ItemPedidoTest {

    @Test
    public void testCalcularSubtotalCorreto() {
        Produto p = new Produto("Cappuccino", 8.50);
        ItemPedido item = new ItemPedido(p, 3);
        assertEquals(25.50, item.calcularSubtotal(), 0.001);
    }

    @Test
    public void testGetProdutoRetornaCorretamente() {
        Produto p = new Produto("Espresso", 5.00);
        ItemPedido item = new ItemPedido(p, 2);
        assertEquals(p, item.getProduto());
    }

    @Test
    public void testGetQuantidadeRetornaCorretamente() {
        Produto p = new Produto("Latte", 7.00);
        ItemPedido item = new ItemPedido(p, 4);
        assertEquals(4, item.getQuantidade());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuantidadeZeroDeveLancarExcecao() {
        Produto p = new Produto("Cappuccino", 8.50);
        new ItemPedido(p, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testQuantidadeNegativaDeveLancarExcecao() {
        Produto p = new Produto("Cappuccino", 8.50);
        new ItemPedido(p, -1);
    }
}