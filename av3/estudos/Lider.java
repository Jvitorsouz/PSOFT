public class Lider implements Pessoa {

    private String nome;
    private Papel papel;

    public Lider(String nome){
        this.nome = nome;
        this.papel = papel.LIDER;
    }


    public String getNome(){
        return this.nome;
    }

    public Papel getPapel() {
        return this.papel;
    }
    
}
