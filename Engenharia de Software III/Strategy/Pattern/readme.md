# Strategy ou Estratégia

O Strategy é um padrão de projetos que permite que você defina uma família de algoritmos, ou seja, várias formas de resolver um problema, coloque-os em classes separadas. Então, cria-se uma interface comum a todos eles. Isso permite que se troque os algoritmos em tempo de execução.

## Vantagens do Strategy
O Strategy permite flexibilidade para poder trocar o algoritmo sem precisar mexer no código principal. Além disso, ele fica alinhado com o princípio do SOLID conhecido como OCP (Open/Closed Principle), ou seja, aberto para extensão, fechado para modificação.
Outra vantagem é o reaproveitamento de código e a prevenção de não repetir o código.
Abaixo, um exemplo de um projeto em Java que aplica o Strategy.


```java
//Aqui, criou-se uma interface para os métodos de pagamento para as outras classes,
//que serão concretas e irão implementar esse contrato
public interface MetodoDePagamento{
  void pagar(double valor);
}

//Classes concretas
public class PagamentoPix implements MetodoDePagamento{
    @Override
    public void pagar(double valor){
      System.out.println("Pagando R$"+ valor + " no pix!");
  }
}

public class PagamentoCartão implements MetodoDePagamento{
    @Override
    public void pagar(double valor){
      System.out.println("Pagando R$"+ valor + " no cartão!");
  }
}

public class PagamentoBoleto implements MetodoDePagamento{
    @Override
    public void pagar(double valor){
      System.out.println("Pagando R$"+ valor + " no boleto!");
  }
}




public class Carrinho{
    private MetodoDePagamento pagamento;

    public void setMetodo(MetodoDePagamento pagamento){
      this.pagamento = pagamento;
    }

    public void finalizarCompra(double valor){
      pagamento.pagar(valor);
    }
}


// Testando
public class Main {
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho();

        carrinho.setMetodo(new PagamentoCartao());
        carrinho.finalizarCompra(100.0);

        carrinho.setMetodo(new PagamentoBoleto());
        carrinho.finalizarCompra(200.0);

        carrinho.setMetodo(new PagamentoPix());
        carrinho.finalizarCompra(300.0);
    }
}

```
