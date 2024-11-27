import java.util.HashMap;

public class Pessoa {

    private String nome;
    private int idade;
    private String cpf;
    private String telefone;
    private HashMap<Integer, Endereco> enderecos;
    private String profissao;
    private int qtdEnd;

    public Pessoa(String nome, int idade, String cpf, String telefone, String profissao){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone =  telefone;
        this.enderecos = new HashMap<>();
        this.profissao = profissao;
        this.qtdEnd = 0;
    }

    public String toString(){
        String retorno = "Nome: " + this.nome + "\n"+
                         "Idade: " + this.idade + "\n"+
                         "Cpf: " + this.cpf + "\n"+
                         "Telefone: " + this.telefone + "\n"+
                         "Profissao: " + this.profissao + "\n";
        return retorno;
    }

    public void addEndereco(String rua, String cep, int numero, String bairro){
        this.qtdEnd += 1;
        this.enderecos.put(numero, new Endereco(rua, cep, numero, bairro));
    }

    public String mostrarEnderecos(){

        if(this.qtdEnd == 0){
            return "Não há endereços cadastrados";
        }

        String retorno =  "\n";

        for(int chave: this.enderecos.keySet()){
            Endereco endereco = this.enderecos.get(chave);
            retorno += endereco.toString() + "\n";
        }

        return retorno;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String setEndereco(int numero,  String rua, String cep, int novoNumero, String bairro) {
        Endereco endereco = this.enderecos.get(numero);

        if(endereco == null){
            return "Endereço não encotrado";
        }
        
        endereco.setRua(rua);
        endereco.setCep(cep);
        endereco.setNumero(novoNumero);
        endereco.setBairro(bairro);

        return "Endereço atualizado";
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String apagarEndereco(int numero){
        Endereco endereco = this.enderecos.get(numero);

        if(endereco == null){
            return "Endereço não encotrado";
        }

        this.enderecos.remove(numero);

        return "Endereço apagado";
    }
   
 
}