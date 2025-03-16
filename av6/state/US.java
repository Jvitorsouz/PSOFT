public class US {

    private String id;
    private Estado estado;
    private boolean ehAprovado;

    public US(String id) {
        this.id = id;
        this.estado = new Todo(this);
        this.ehAprovado = false;
    }

    public void mover(Pessoa pessoa){
        this.estado.move(pessoa);
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean getEhAprovado() {
        return this.ehAprovado;
    }

    public void setEhAprovado(Pessoa pessoa) {
        if(!pessoa.isDev()){
            this.ehAprovado = true;
        }
    }
}
