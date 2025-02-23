import java.util.Collections;
import java.util.List;

public class QuickSort implements Ordenador{

    @Override
    public List<Integer> Ordenar(List<Integer> elementos) {
        Collections.sort(elementos);
        return elementos;
    }
}
