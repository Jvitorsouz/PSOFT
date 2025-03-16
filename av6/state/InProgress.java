public class InProgress implements Estado{

    private US us;

    public InProgress(US us){
        this.us = us;
    }

    @Override
    public void move(Pessoa pessoa) {
        if(pessoa.isDev()){
            Estado novoEstado = new ToVerify(us);
            this.us.setEstado(novoEstado);
        }
    }
}
