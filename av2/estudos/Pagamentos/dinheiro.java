package Pagamentos;

public class dinheiro extends PagamentoAbstract{

    public dinheiro(double total){
        super(total);
    }

    @Override
    public String pagar() {
        return "Pagamento de R$ " + super.getTotal() + " realizado em Dinheiro.";
    }
    
}
