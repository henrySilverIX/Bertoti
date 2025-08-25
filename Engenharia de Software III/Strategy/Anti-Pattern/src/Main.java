import models.Cliente;
import models.ClienteAluno;
import models.ClienteEmpresa;
import models.ClientePremium;
import models.ClienteIdoso;



public class Main {
    public static void main(String[] args) {
        Cliente empresa = new ClienteEmpresa("Loja XPTO", "11222333000144", 5000);
        Cliente premium = new ClientePremium("Ana", "12345678900", 5000);
        Cliente idoso = new ClienteIdoso("Dona Maria", "98765432100", 1500);
        Cliente aluno = new ClienteAluno("Bruno", "47865124685", 12000);

        empresa.emprestimo(1000);
        premium.emprestimo(1000);
        idoso.emprestimo(1500);
        idoso.emprestimo(800);

        aluno.emprestimo(6000);
    }
}
