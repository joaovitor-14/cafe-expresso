package cafe.expresso;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProdutoTest {

    @Test
    public void testCriarProdutoValido() {
        Produto p = new Produto("Cappuccino", 8.50);
        assertEquals("Cappuccino", p.getNome());
        assertEquals(8.50, p.getPrecoUnitario(), 0.001);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNomeVazioDeveLancarExcecao() {
        new Produto("", 8.50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNomeNuloDeveLancarExcecao() {
        new Produto(null, 8.50);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrecoNegativoDeveLancarExcecao() {
        new Produto("Cappuccino", -1.0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrecoZeroDeveLancarExcecao() {
        new Produto("Cappuccino", 0);
    }
}