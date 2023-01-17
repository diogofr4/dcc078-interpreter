import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AventureiroTest {
    @Test
    void deveCalcularDanoRecebido() {
        Aventureiro aventureiro = new Aventureiro();
        aventureiro.setDanoRecebido(100);
        aventureiro.setBonusDano(2.0);
        aventureiro.setDefesa(50.5);

        assertEquals(149.5, aventureiro.calcularDanoRecebido());
    }

    @Test
    void deveCalcularDanoRealizado() {
        Aventureiro aventureiro = new Aventureiro();
        aventureiro.setDanoRealizado(100);
        aventureiro.setBonusDano(2.0);

        assertEquals(400.0, aventureiro.calcularDanoRealizado());
    }
}
