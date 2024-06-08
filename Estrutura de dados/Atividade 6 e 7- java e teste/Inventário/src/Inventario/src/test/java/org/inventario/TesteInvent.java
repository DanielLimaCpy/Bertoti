package org.inventario;

import org.Inventario.Inventario;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteInvent {
    private Inventario inventario;

    @BeforeEach
    void setUp() {
        inventario = new Inventario();
    }

    @Test
    void adicionarItem_deveAdicionarItemCorretamente() {
        String resultado = inventario.adicionarItem("Batman begins",30,"superherois");
        assertEquals("Batman begins adicionado ao inventário", resultado);
    }

    @Test
    void listarItens_quandoInventarioVazio_deveRetornarInventarioVazio() {
        String resultado = inventario.listarItens();
        assertEquals("Inventário vazio", resultado);
    }

    @Test
    void listarItens_quandoInventarioNaoVazio_deveRetornarItensDisponiveis() {
        inventario.adicionarItem("Batman begins", 30, "superherois");
        String resultado = inventario.listarItens();
        assertTrue(resultado.contains("Itens disponíveis"));

    }

    @Test
    void removerItem_quandoItemExistente_deveRemoverItemCorretamente() {
        inventario.adicionarItem("Batman begins",30,"superherois");
        String resultado = inventario.removerItem("Batman begins",30,"superherois");
        assertEquals("Batman begins recolhido", resultado);
    }

}
