package pagamento;

public class PagamentoCartao implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no Cartão.");
    }
}
