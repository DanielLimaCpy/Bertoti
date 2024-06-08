package org.Inventario;

public class Item {
    private String nome;
    private int tamanho;
    private String conjunto;

    public Item(String nome, int tamanho, String conjunto) {
        this.nome = nome;
        this.tamanho = tamanho;
        this.conjunto = conjunto;
    }

    public String getNome() {
        return nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getConjunto() {
        return conjunto;
    }
}
