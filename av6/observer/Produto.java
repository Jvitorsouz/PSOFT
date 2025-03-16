import java.util.ArrayList;
import java.util.List;

class Produto {
    private String nome;
    private String link;
    private List<DisponibilidadeListener> observadoresDisponibilidade = new ArrayList<>();
    private List<PromocaoListener> observadoresPromocao = new ArrayList<>();
    private boolean disponivel = false;
    private boolean emPromocao = false;
    private String codigoPromocional;

    public Produto(String nome, String link) {
        this.nome = nome;
        this.link = link;
    }

    public void adicionarObservadorDisponibilidade(DisponibilidadeListener observer) {
        observadoresDisponibilidade.add(observer);
    }

    public void removerObservadorDisponibilidade(DisponibilidadeListener observer) {
        observadoresDisponibilidade.remove(observer);
    }

    public void adicionarObservadorPromocao(PromocaoListener observer) {
        observadoresPromocao.add(observer);
    }

    public void removerObservadorPromocao(PromocaoListener observer) {
        observadoresPromocao.remove(observer);
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
        if (disponivel) {
            notificarDisponibilidade();
        }
    }

    public void setPromocao(boolean emPromocao, String codigo) {
        this.emPromocao = emPromocao;
        this.codigoPromocional = codigo;
        if (emPromocao) {
            notificarPromocao();
        }
    }

    private void notificarDisponibilidade() {
        EventoDisponibilidade evento = new EventoDisponibilidade(nome, link, observadoresDisponibilidade);
        evento.notificar();
    }

    private void notificarPromocao() {
        EventoPromocao evento = new EventoPromocao(nome, link, codigoPromocional, observadoresPromocao);
        evento.notificar();
    }
}
