public abstract class Lanchonete {

    public final void prepararBebida(){
        esquentarAgua();
        prepararIngredientes();
        servirCopo();
        adicionarComplementos();
    }

    private void esquentarAgua(){
        System.out.println("Esquentando...");
    }

    protected abstract void prepararIngredientes();

    private void servirCopo(){
        System.out.println("Servindo...");
    }

    protected abstract void adicionarComplementos();
    
}
