

public class ItemVenda {

    private Produto produto;
    private int qtd;


    public ItemVenda(Produto produto, int qtd){
        this.produto = produto;
        this.qtd = qtd;
    }

    public double subTotal(){
        if(qtd > 100){
            return (produto.getPreco() * qtd) * 0.9;
        }
        return produto.getPreco() * qtd;
    }

    
}
