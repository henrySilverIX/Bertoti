package models;

public class Cliente {
    public String nome;
    public String cpf;
    public double saldo;


    //Construtor
    public Cliente(String _nome, String _cpf, double _saldo){
        this.nome = _nome;
        this.cpf = _cpf;
        this.saldo = _saldo;
    }



    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void emprestimo(double valor_emprestimo){
        this.saldo -= valor_emprestimo;
    }
}
