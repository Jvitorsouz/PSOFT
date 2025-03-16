import java.util.List;

class EventoPromocao implements Evento {
    private String nomeProduto;
    private String link;
    private String codigoPromocional;
    private List<PromocaoListener> observadores;

    public EventoPromocao(String nomeProduto, String link, String codigoPromocional, List<PromocaoListener> observadores) {
        this.nomeProduto = nomeProduto;
        this.link = link;
        this.codigoPromocional = codigoPromocional;
        this.observadores = observadores;
    }

    @Override
    public void notificar() {
        for (PromocaoListener obs : observadores) {
            obs.onProdutoEmPromocao("O produto " + nomeProduto + " está em promoção! Acesse: " + link + " | Código: " + codigoPromocional);
        }
    }
}
