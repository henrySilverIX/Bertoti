package src;
import src.models.*;


// Teste
public class Main {
    public static void main(String[] args) {
        Canal canal = new Canal();

        Usuario joao = new Usuario("João");
        Usuario maria = new Usuario("Maria");

        canal.adicionar(joao);
        canal.adicionar(maria);

        canal.publicarVideo("Design Pattern Observer explicado!");
    }
}
