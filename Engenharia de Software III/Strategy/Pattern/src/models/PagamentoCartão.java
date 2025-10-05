package src.models;


public class PagamentoCartão implements MetodoDePagamento{
    @Override
    public void pagar(double valor){
      System.out.println("Pagando R$"+ valor + " no cartão!");
  }
}
