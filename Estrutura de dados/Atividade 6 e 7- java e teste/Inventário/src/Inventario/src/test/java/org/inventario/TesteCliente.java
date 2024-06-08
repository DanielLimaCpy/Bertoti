package org.inventario;

import org.Inventario.Cliente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCliente {
    @Test
    void getNome_deveRetornarNomeCorretamente(){
        Cliente cliente = new Cliente("Daniel","1234345","Rua de baixo");
        assertEquals("Daniel", cliente.getNome());
    }

    @Test
    void getCpf_deveRetornarCpfCorretamente(){
        Cliente cliente = new Cliente("Daniel","1234345","Rua de baixo");
        assertEquals("1234345", cliente.getCpf());
    }

    @Test
    void getEndereco_deveRetornarEnderecoCorretamente(){
        Cliente cliente = new Cliente("Daniel","1234345","Rua de baixo");
        assertEquals("Rua de baixo", cliente.getEndereco());
    }
}
