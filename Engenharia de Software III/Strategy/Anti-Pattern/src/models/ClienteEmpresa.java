package models;

public class ClienteEmpresa extends Cliente{
    public ClienteEmpresa(String _nome, String _cpf, double _saldo){
        super(_nome, _cpf, _saldo);
    }

    @Override
    public void emprestimo(double valor) {
        double limite = valor * 2; // Empresa tem crédito maior
        setSaldo(getSaldo() - limite);
        System.out.println(getNome() + " (Empresa) fez um empréstimo de R$ " + limite + ". Novo saldo: " + getSaldo());
    }
}
