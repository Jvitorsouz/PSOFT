package Pagamentos;

public class cartao  extends PagamentoAbstract{

    private int vezes;

    public cartao(double total, int vezes){
        super(total);
        this.vezes = vezes;
    }

    @Override
    public String pagar() {
        return "Pagamento de R$ " + super.getTotal() + " em " + this.vezes + "Vezes realizado via Cartao.";
    }

}
