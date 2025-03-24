public class Cafe extends Lanchonete {

    @Override
    protected void prepararIngredientes() {
        System.out.println("Moendo e coando o café");
    }

    @Override
    protected void adicionarComplementos() {
        System.out.println("Adicionando leite e açucar");
    }
    
}
