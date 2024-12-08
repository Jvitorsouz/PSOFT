package Pagamentos;

public class pix extends PagamentoAbstract {

    public pix(double total){
        super(total);
    }

    @Override
    public String pagar() {
        return "Pagamento de R$ " + super.getTotal() + " realizado via Pix.";
    }

    
}
