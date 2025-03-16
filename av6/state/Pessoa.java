public class Pessoa {

    private Cargo cargo;
    private String nome;
    private String id;

    public Pessoa(Cargo cargo, String nome, String id) {
        this.cargo = cargo;
        this.nome = nome;
        this.id = id;
    }

    public boolean isDev(){
        return this.cargo == Cargo.DESENVOLVEDOR ? true : false;
    }
}
