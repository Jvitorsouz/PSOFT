import java.util.HashMap;
import java.util.Map;

public class ScrumBoard {

    private Map<String, US> USs;
    private Map<String, Pessoa> pessoas;

    public ScrumBoard() {
        this.USs = new HashMap<>();
    }

    public void criarUs(String id){
        this.USs.put(id, new US(id));
    }

    public void addDev(String id, String nome){
        this.pessoas.put(id, new Pessoa(Cargo.DESENVOLVEDOR,nome, id));
    }

    public void addSM(String id, String nome){
        this.pessoas.put(id, new Pessoa(Cargo.SCRUM_MASTER,nome, id));
    }

    public void aprovaUs(String idUs, String idPessoa){
        US us = this.USs.get(idUs);
        Pessoa pessoa = this.pessoas.get(idPessoa);

        if(us != null && pessoa != null){
            us.setEhAprovado(pessoa);
        }
    }

    public void moverUs(String idUs, String idPessoa){
        US us = this.USs.get(idUs);
        Pessoa pessoa = this.pessoas.get(idPessoa);

        if(us != null && pessoa != null){
            us.mover(pessoa);
        }
    }
}
