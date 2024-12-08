import java.util.HashMap;

public class Mercado {

    private HashMap<Integer, Venda> historicos;
    private int qtdVendas;

    public Mercado(){
        this.historicos = new HashMap<>();
    }

    public int criaVenda(){
        Venda venda = new Venda();
        this.qtdVendas++;
        this.historicos.put(qtdVendas, venda);
        return this.qtdVendas;
    }
    
    public void addProduto(Produto p, int qtd, int id){
        Venda venda = this.historicos.get(id);
        venda.addProduto(p, qtd);
    }

    public String pagarVendaDinheiro(int id){
        Venda venda = this.historicos.get(id);
        return venda.pagamentoDinheiro();
    }

    public String pagarVendaPix(int id){
        Venda venda = this.historicos.get(id);
        return venda.pagamentoPix();
    }

    public String pagarVendaCartao(int id, int vezes){
        Venda venda = this.historicos.get(id);
        return venda.pagamentoCartao(vezes);
    }
    
}
