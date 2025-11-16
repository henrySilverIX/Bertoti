import models.Loja;
import models.Cliente;

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja();

        Cliente joao = new Cliente("João", "joao@email.com");
        Cliente maria = new Cliente("Maria", "maria@email.com");
        Cliente pedro = new Cliente("Pedro", "pedro@email.com");

        loja.cadastrarCliente(joao);
        loja.cadastrarCliente(maria);
        loja.cadastrarCliente(pedro);

        // NINGUÉM se inscreveu voluntariamente nesse produto
        // Mesmo assim, a loja manda email para TODO MUNDO
        loja.lancarProduto("PlayStation 6");
    }
}
