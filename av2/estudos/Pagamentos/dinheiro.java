package Pagamentos;

public class dinheiro implements Pagamento {

    private double preco;

    public void pagar(double preco){
        this.preco = preco;
    }
    
}
