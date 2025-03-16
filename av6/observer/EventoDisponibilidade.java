import java.util.List;

class EventoDisponibilidade implements Evento {
    private String nomeProduto;
    private String link;
    private List<DisponibilidadeListener> observadores;

    public EventoDisponibilidade(String nomeProduto, String link, List<DisponibilidadeListener> observadores) {
        this.nomeProduto = nomeProduto;
        this.link = link;
        this.observadores = observadores;
    }

    @Override
    public void notificar() {
        for (DisponibilidadeListener obs : observadores) {
            obs.onProdutoDisponivel("O produto " + nomeProduto + " está disponível! Acesse: " + link);
        }
    }
}
