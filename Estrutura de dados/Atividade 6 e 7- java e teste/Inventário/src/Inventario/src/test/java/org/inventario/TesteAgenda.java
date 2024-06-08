package org.inventario;
import org.Inventario.Agenda;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class TesteAgenda {
    @Test
    void adicionarLembrete_deveAdicionarLembreteCorretamente() {
        Agenda.adicionarLembrete("Lavar fantasias", "2024-04-15", "Enviar roupas sujas para a lavanderia");
        assertEquals("Reunião adicionado à agenda", Agenda.adicionarLembrete("Reunião", "2024-04-15", "Discussão de projeto"));
    }

    @Test
    void listarLembretes_deveRetornarListaCorretamente() {
        Agenda.adicionarLembrete("Lavar fantasias", "2024-04-15", "Enviar roupas sujas para a lavanderia");
        assertEquals("Lembretes disponíveis\n - Lavar fantasias para 2024-04-15: Enviar roupas sujas para a lavanderia\n", Agenda.listarLembretes());
    }

    @Test
    void removerLembrete_deveRemoverLembreteCorretamente() {
        Agenda.adicionarLembrete("Lavar fantasias", "2024-04-15", "Enviar roupas sujas para a lavanderia");
        assertEquals("Lavar fantasias removido", Agenda.removerLembrete("Lavar fantasias"));
    }
}
