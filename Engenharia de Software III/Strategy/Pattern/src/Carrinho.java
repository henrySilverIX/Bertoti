package src;
import src.models.*;


public class Carrinho{
    private MetodoDePagamento pagamento;

    public void setMetodo(MetodoDePagamento pagamento){
      this.pagamento = pagamento;
    }

    public void finalizarCompra(double valor){
      pagamento.pagar(valor);
    }
}