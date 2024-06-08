package org.Inventario;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private static List<Item> itens = new ArrayList<>();

    static {
        itens = new ArrayList<>();
    }

    public static String adicionarItem(String nome, int tamanho, String conjunto) {
        Item novoItem = new Item(nome, tamanho, conjunto);
        itens.add(novoItem);
        return nome + " adicionado ao inventário";
    }

    public String listarItens() {
        if (itens.isEmpty()) {
            return "Inventário vazio";
        } else {
            StringBuilder itensDisponiveis = new StringBuilder("Itens disponíveis\n");
            for (Item item : itens) {
                itensDisponiveis.append(" - ").append(item.getNome()).append(" por ").append(item.getTamanho()).append(item.getConjunto()).append("\n");
            }
            return itensDisponiveis.toString();
        }
    }

    public String removerItem(String nome, int tamanho, String conjunto) {
        for (Item item : itens) {
            if (item.getNome().equals(nome)) {
                itens.remove(item);
                return nome + " recolhido";
            }
        }
        return "Item não encontrado";
    }
}

