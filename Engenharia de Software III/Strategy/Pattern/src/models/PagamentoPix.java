package src.models;

public class PagamentoPix implements MetodoDePagamento{
    @Override
    public void pagar(double valor){
      System.out.println("Pagando R$"+ valor + " no pix!");
  }
}

