package src;
import src.models.*;


public class Main {
    public static void main(String[] args) {
      Carrinho carrinho = new Carrinho();
    carrinho.setMetodo(new PagamentoCartão());
    carrinho.finalizarCompra(100.0);
    
    carrinho.setMetodo(new PagamentoBoleto());
    carrinho.finalizarCompra(200.0);

    carrinho.setMetodo(new PagamentoPix());
    carrinho.finalizarCompra(300.0);
  }
}
