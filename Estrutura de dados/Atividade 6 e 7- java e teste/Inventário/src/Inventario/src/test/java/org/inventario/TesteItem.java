package org.inventario;
import org.Inventario.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TesteItem {
    @Test
    void getNome_deveRetornarNomeCorretamente() {
        Item item = new Item("Batman begins", 30, "Superherois");
        assertEquals("Batman begins", item.getNome());
    }

    @Test
    void getEspaco_deveRetornartamanhoCorretamente() {
        Item item = new Item("Batman begins", 30, "Superherois");
        assertEquals(30, item.getTamanho());
    }

    @Test
    void getQuantidade_deveRetornarQuantidadeCorretamente() {
        Item item = new Item("Batman begins", 30, "Superherois");
        assertEquals("Superherois", item.getConjunto());
    }
}
