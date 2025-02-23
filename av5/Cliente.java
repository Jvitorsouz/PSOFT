import java.util.List;

public class Cliente {
    
    private  Ordenador ordenador;

    public Cliente(){
        //Ordenador default
        this.ordenador = new InsertionSort();
    }

    public List<Integer> ordena(List<Integer> elementos){
        return ordenador.Ordenar(elementos);
    }

    public void setOrdenadorBubbleSort(){
        this.ordenador = new BubbleSort();
    }

    public void setOrdenadorMergeSort(){
        this.ordenador = new MergeSort();
    }

    public void setOrdenadorQuickSort(){
        this.ordenador = new QuickSort();
    }

    public void setOrdenadorInsertionSort(){
        this.ordenador = new InsertionSort();
    }
}
