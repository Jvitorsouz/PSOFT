import java.util.HashMap;


public class Controller {

    private HashMap<String, Pessoa> pessoas;

    public Controller(){
        this.pessoas = new HashMap<>();
    }

    public void cadastrarPessoa(String nome, int idade, String cpf, String profissao){
        Pessoa pessoa = new Pessoa(nome, idade, cpf, profissao);
        this.pessoas.put(cpf, pessoa);
    }

    public void cadastrarEndereco(String cpf, String rua, int numero, String bairro, String cep){
        Pessoa pessoa = pessoas.get(cpf);
        pessoa.addEndereco(rua, numero, bairro, cep);
    }

    public void atualizaEndereco(String cpf, String rua, int numero, String bairro, String cep){
        Pessoa pessoa = pessoas.get(cpf);
        pessoa.setEndereco(rua, numero, bairro, cep);
    }

    public void atualizaIdade(String cpf, int idade){
        Pessoa pessoa = this.pessoas.get(cpf);
        pessoa.setIdade(idade);
    }

    public void atualizaProfissao(String cpf, String profissao){
        Pessoa pessoa = this.pessoas.get(cpf);
        pessoa.setProfissao(profissao);
    }

    public String mostrarPessoa(String cpf){
        Pessoa pessoa = this.pessoas.get(cpf);
        return "\n" + pessoa.toString();
    }

    public void deletarEndereco(String cpf, int numero){
        Pessoa pessoa = this.pessoas.get(cpf);
        pessoa.deletaEndereco(numero);
    }

    public void deletarPessoa(String cpf){
        this.pessoas.remove(cpf);
    }

    public String mostrarPessoas(){
        String retorno = "\n";
        for (String chave: pessoas.keySet()){
            retorno += pessoas.get(chave).toString() + System.lineSeparator();
        }

        return retorno;
    }
    
}
