public class Desenvolvedor implements Pessoa{

    private String nome;
    private Papel papel;

    public Desenvolvedor(String nome){
        this.nome = nome;
        this.papel = papel.DESENVOLVEDOR;
    }

    public String getNome(){
        return this.nome;
    }

    public Papel getPapel() {
        return this.papel;
    }
}