package models;

public class ClienteIdoso extends Cliente{
    public ClienteIdoso(String _nome, String _cpf, double _saldo) {
        super(_nome, _cpf, _saldo);
    }

    @Override
    public void emprestimo(double valor) {
        if (valor > 1000) {
            System.out.println(getNome() + " (Idoso) não pode pegar empréstimos acima de R$ 1000.");
        } else {
            setSaldo(getSaldo() - valor);
            System.out.println(getNome() + " (Idoso) fez um empréstimo de R$ " + valor + ". Novo saldo: " + getSaldo());
        }
    }
}
