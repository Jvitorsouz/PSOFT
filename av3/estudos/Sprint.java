import java.util.HashMap;
import java.util.Map;

public class Sprint<T extends Pessoa>{

    private T lider;
    private T gerente;
    private Map<Integer, T> desenvolvedores;
    private Time<T> time;


    public Sprint(){
        this.lider = null;
        this.gerente = null;
        this.desenvolvedores = new HashMap<>();
        this.time= new Time();
    }

    public void setLider(T lider){
        this.lider = lider;
        this.time.addMenbro(lider);
    }

    public void setGerente(T newGerente){
        this.gerente = newGerente;
        this.time.addMenbro(newGerente);
    }

    public void addDesenvoveldor(int id, T desenvolvedor){
        this.desenvolvedores.put(id, desenvolvedor);
        this.time.addMenbro(desenvolvedor);
    }

    public void deleteDesenvolvedor(int id){
        T dev = this.desenvolvedores.get(id);
        this.time.removeMenbro(dev);
        this.desenvolvedores.remove(id);

    }

    
}