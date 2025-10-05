package src.models;

public class PagamentoBoleto implements MetodoDePagamento{
    @Override
    public void pagar(double valor){
      System.out.println("Pagando R$"+ valor + " no boleto!");
  }
}
