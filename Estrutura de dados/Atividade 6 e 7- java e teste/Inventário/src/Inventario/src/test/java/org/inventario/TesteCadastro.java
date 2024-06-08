package org.inventario;
import org.Inventario.Cadastro;
import org.Inventario.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TesteCadastro {
    private Cliente cliente;

    @BeforeEach
    void setUp(){
        cliente = new Cliente("Daniel","123456","Rua de Baixo");
    }

    @Test
    void cadastrar_cliente_deveCadastrarClienteComSucesso(){
        assertEquals("Daniel foi cadastrado com sucesso", Cadastro.cadastrarCliente(cliente));
    }
}
