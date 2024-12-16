import java.util.ArrayList;
import java.util.List;

public class Time<T extends Pessoa>{

    private List<T> menbros;

    public Time(){
        this.menbros = new ArrayList<>();
    }

    public void addMenbro(T menbro){
        this.menbros.add(menbro);
    }

    public void removeMenbro(T menbro){
        if(this.menbros.contains(menbro)){
            this.menbros.remove(menbro);
        }
    }
}