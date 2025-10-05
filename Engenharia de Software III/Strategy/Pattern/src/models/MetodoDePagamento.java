package src.models;


//Aqui, criou-se uma interface para os métodos de pagamento para as outras classes,
//que serão concretas e irão implementar esse contrato
public interface MetodoDePagamento{
  void pagar(double valor);
}
