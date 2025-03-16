public class Todo implements Estado{

    private US us;

    public Todo(US us){
        this.us = us;
    }

    @Override
    public void move(Pessoa pessoa) {
        Estado novoEstado = new InProgress(this.us);
        this.us.setEstado(novoEstado);

    }
}
