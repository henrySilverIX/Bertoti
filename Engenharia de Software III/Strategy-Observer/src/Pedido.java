import pagamento.MetodoPagamento;
import observer.EventoLoja;

public class Pedido {

    private double valor;
    private MetodoPagamento metodoPagamento;
    private EventoLoja eventos;

    public Pedido(double valor, EventoLoja eventos) {
        this.valor = valor;
        this.eventos = eventos;
    }

    public void setMetodoPagamento(MetodoPagamento metodo) {
        this.metodoPagamento = metodo;
    }

    public void pagar() {
        metodoPagamento.pagar(valor);
        eventos.notificar("Pedido pago no valor de R$" + valor);
    }
}
