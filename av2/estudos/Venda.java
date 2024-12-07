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

    public void pagamentoDinheiro(){
        this.pagamento = new dinheiro();
        this.pagamento.pagar(total());
    }

    public void pagamentoPix(){
        this.pagamento = new pix();
        this.pagamento.pagar(total());
    }

    public void pagamentoCartao(){
        this.pagamento = new cartao();
        this.pagamento.pagar(total());
    }
}
