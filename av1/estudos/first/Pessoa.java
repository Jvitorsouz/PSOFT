import java.util.HashMap;

public class Pessoa{

    private String nome;
    private int idade;
    private String cpf;
    private HashMap<Integer, Endereco> enderecos;
    private String profissao;

    public Pessoa(String nome, int idade, String cpf, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.enderecos = new HashMap<>();
        this.profissao = profissao;
    }

    public void addEndereco(String rua, int numero, String bairro, String cep){
        this.enderecos.put(numero, new Endereco(rua, numero, bairro, cep));
    }

    public void setEndereco(String rua, int numero, String bairro, String cep){
        Endereco endereco = this.enderecos.get(cep);
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
    }

    public void setIdade(int newIdade){
        this.idade = newIdade;
    }

    public void setProfissao(String newProfissao){
        this.profissao = newProfissao;
    }

    public void deletaEndereco(int numero){
        this.enderecos.remove(numero);
    }

    public String toString(){
        String resultado =  "Nome: " + this.nome + "\n"+
                            "Idade: " + this.idade + "\n"+
                            "Cpf: " + this.cpf + "\n"+
                            "Profissao: " + this.profissao + "\n";
        return resultado;
    }


}