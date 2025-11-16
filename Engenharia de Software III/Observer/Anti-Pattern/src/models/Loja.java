package models;

import java.util.ArrayList;
import java.util.List;

public class Loja {

    // Lista de TODOS os clientes cadastrados
    private List<Cliente> clientes = new ArrayList<>();

    // Anti-padrão: não existe lista de assinantes
    // Não existe "interesse" em um produto específico

    public void cadastrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void lancarProduto(String produto) {
        System.out.println("Loja lançou o produto: " + produto);

        // Anti-padrão: avisa TODO MUNDO
        // Mesmo quem não pediu para ser notificado.
        for (Cliente cliente : clientes) {
            cliente.receberEmail("Novo produto disponível: " + produto);
        }
    }
}
