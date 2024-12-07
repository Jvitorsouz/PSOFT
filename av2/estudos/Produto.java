public class Produto {

    private String descricao;
    private double preco;


    public Produto(String descricao, double prec){
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco(){
        return this.preco;
    }
    
}
