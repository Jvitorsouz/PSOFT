public class Gerente implements Pessoa {

    private String nome;
    private Papel papel;

    public Gerente(String nome){
        this.nome = nome;
        this.papel = papel.GERENTE;
    }

    public String getNome(){
        return this.nome;
    }

    public Papel getPapel() {
        return this.papel;
    }
    
}
