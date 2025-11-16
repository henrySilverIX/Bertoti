package pagamento;

public class PagamentoBoleto implements MetodoPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " gerou um boleto.");
    }
}
