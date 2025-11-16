import pagamento.*;
import observer.*;

public class Main {
    public static void main(String[] args) {

        // Evento central da loja
        EventoLoja eventos = new EventoLoja();

        // Observadores
        ClienteObservador joao = new ClienteObservador("João");
        ClienteObservador maria = new ClienteObservador("Maria");

        // Inscrevendo observadores
        eventos.inscrever(joao);
        eventos.inscrever(maria);

        // Criando um pedido
        Pedido pedido = new Pedido(250.00, eventos);

        // Definindo a estratégia usada neste pedido
        pedido.setMetodoPagamento(new PagamentoPix());

        // Ao pagar, ocorre:
        // 1) Execução do Strategy
        // 2) Disparo do evento Observer
        pedido.pagar();
    }
}
