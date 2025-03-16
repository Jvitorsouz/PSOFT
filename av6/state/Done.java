public class Done implements Estado{

    private US us;

    public Done(US us) {
        this.us = us;
    }

    @Override
    public void move(Pessoa pessoa) {
        //NAO ACONTECE NADA
    }
}
