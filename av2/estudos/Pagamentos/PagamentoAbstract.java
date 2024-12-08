package Pagamentos;

public abstract class PagamentoAbstract implements Pagamento{

    private double total;

    public PagamentoAbstract(double preco){
        this.total = preco;
    }

    public double getTotal(){
        return this.total;
    }

    public abstract String pagar();
    
}
