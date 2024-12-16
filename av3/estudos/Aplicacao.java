public class Aplicacao {

    private Sprint sprint;

    public Aplicacao(){
        this.sprint = new Sprint();
    }

    public void addLider(int id, Pessoa lider){
        this.sprint.setLider(lider);
    }

    public void addDesenvolvedor(int id, Pessoa dev){
        this.sprint.addDesenvoveldor(id, dev);
    }

    public void atualizaGerente(Pessoa newGerente){
        this.sprint.setGerente(newGerente);
    }
    
}
