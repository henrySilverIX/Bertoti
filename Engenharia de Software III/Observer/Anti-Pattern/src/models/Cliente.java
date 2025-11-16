package models;

public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void receberEmail(String mensagem) {
        System.out.println("[EMAIL] " + nome + " recebeu: " + mensagem);
    }
}
