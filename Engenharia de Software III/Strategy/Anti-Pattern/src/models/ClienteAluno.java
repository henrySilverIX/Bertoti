package models;

public class ClienteAluno extends Cliente{
    public ClienteAluno(String _nome, String _cpf, double _saldo){
        super(_nome, _cpf, _saldo);
    }

    @Override
    public void emprestimo(double valor_emprestimo){
        if (valor_emprestimo > 5000) {
            System.out.println(getNome() + " (Cliente Aluno) não pode pegar empréstimos acima de R$ 1000.");
        } else {
            setSaldo(getSaldo() - valor_emprestimo);
            System.out.println(getNome() + " (Cliente Aluno) fez um empréstimo de R$ " + valor_emprestimo + ". Novo saldo: " + getSaldo());
        }
    }
}
