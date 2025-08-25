package models;

public class ClientePremium extends Cliente {

    public ClientePremium(String _nome, String _cpf, double _saldo){
        super(_nome, _cpf, _saldo);
    }

    @Override
    public void emprestimo(double valor) {
        if (valor > 50000) {
            System.out.println(getNome() + " (Cliente Premium) não pode pegar empréstimos acima de R$ 50.000.");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println(getNome() + " (Cliente Premium) fez um empréstimo de R$ " + valor + ". Novo saldo: " + getSaldo());
        }
    }
}