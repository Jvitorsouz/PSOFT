import java.util.ArrayList;

import Pagamentos.Pagamento;
import Pagamentos.cartao;
import Pagamentos.dinheiro;
import Pagamentos.pix;

public class Venda {

    private ArrayList<ItemVenda> itens;
    private Pagamento pagamento;
    

    public Venda(){
        this.itens = new ArrayList<>();
        this.pagamento = null;
    }

    public void addProduto(Produto p, int qtd){
        itens.add(new ItemVenda(p, qtd));
    }
    

    public double total(){
        double total = 0;

        for(ItemVenda item: itens){
            total += item.subTotal();
        }

        return total;
    }

    public String pagamentoDinheiro(){
        this.pagamento = new dinheiro(total());
        return this.pagamento.pagar();
    }

    public String pagamentoPix(){
        this.pagamento = new pix(total());
        return this.pagamento.pagar();
    }

    public String pagamentoCartao(int qtdVezes){
        this.pagamento = new cartao(total(), qtdVezes);
        return this.pagamento.pagar();
    }
}
