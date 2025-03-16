public class Cliente implements DisponibilidadeListener, PromocaoListener {

    private String nome;

    public Cliente(String nome) {
        this.nome = nome;
    }

    @Override
    public void onProdutoDisponivel(String mensagem) {
        System.out.println(nome + " recebeu alerta de disponibilidade: " + mensagem);
    }

    @Override
    public void onProdutoEmPromocao(String mensagem) {
        System.out.println(nome + " recebeu alerta de promoção: " + mensagem);
    }
}
