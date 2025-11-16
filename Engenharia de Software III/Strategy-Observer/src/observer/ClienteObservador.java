package observer;

public class ClienteObservador implements Observador {

    private String nome;

    public ClienteObservador(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String evento) {
        System.out.println(nome + " recebeu notificação: " + evento);
    }
}
