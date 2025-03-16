public class ToVerify implements Estado{

    private US us;

    public ToVerify(US us){
        this.us = us;
    }

    @Override
    public void move(Pessoa pessoa) {

        if(!pessoa.isDev()){
            if(this.us.getEhAprovado()){
                Estado estado = new Done(this.us);
                this.us.setEstado(estado);
            }else{
                Estado estado = new Todo(this.us);
                this.us.setEstado(estado);
            }
        }

    }
}
