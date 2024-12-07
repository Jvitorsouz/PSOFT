package Pagamentos;

public class cartao  implements Pagamento{

    private double preco;

    @Override
    public void pagar(double preco) {
        this.preco = preco;
    }
    
}
