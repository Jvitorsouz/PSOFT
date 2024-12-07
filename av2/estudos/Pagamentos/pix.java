package Pagamentos;

public class pix implements Pagamento {

    private double preco;

    public void pagar(double preco){
        this.preco = preco;
    }
    
}
