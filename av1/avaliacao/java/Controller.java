import java.util.HashMap;

public class Controller {
    
    private HashMap<String, Pessoa> pessoas;

    public Controller(){
        this.pessoas = new HashMap<>();
    }

    public void cadastrarPessoa(String nome, int idade, String cpf, String telefone, String profissao){
        this.pessoas.put(cpf, new Pessoa(nome, idade, cpf, telefone, profissao));
    }

    public String mostrarPessoa(String cpf){
        Pessoa pessoa = this.pessoas.get(cpf);

        if(pessoa == null){
            return "Usuario não encontrado";
        }

        return pessoa.toString();
    }

    public String mostrarPessoas(){
        String retorno = "\n";

        for(String chave: this.pessoas.keySet()){
            Pessoa pessoa = this.pessoas.get(chave);
            retorno += pessoa.toString() + "\n";
        }

        return retorno;
    }

    public String cadastrarEndereco(String cpf, String rua, String cep, int numero, String bairro){
        Pessoa pessoa = this.pessoas.get(cpf);

        if(pessoa == null){
            return "Usuario não encontrado";
        }

        pessoa.addEndereco(rua, cep, numero, bairro);

        return "Endereço cadastrado";
    }

    public String mostraEnderecos(String cpf){
        Pessoa pessoa = this.pessoas.get(cpf);

        if(pessoa == null){
            return "Usuario não encontrado";
        }

        return pessoa.mostrarEnderecos();
    }
    
    public String atualizarIdade(String cpf, int idade){
        Pessoa pessoa = this.pessoas.get(cpf);
        
        if(pessoa == null){
            return "Usuario não encontrado";
        }

        pessoa.setIdade(idade);

        return "Idade Atualizada";
    }

    public String atualizarTelefone(String cpf, String telefone){
        Pessoa pessoa = this.pessoas.get(cpf);

        if(pessoa == null){
            return "Usuario não encontrado";
        }

        pessoa.setTelefone(telefone);

        return "Telefone atualizado";
    }

    public String atualizarProfissao(String cpf, String profissao){
        Pessoa pessoa = this.pessoas.get(cpf);

        if(pessoa == null){
            return "Usuario não encontrado";
        }

        pessoa.setProfissao(profissao);

        return "Profissao Atualizada";
    }

    public String atualizarEndereco(String cpf, int numero, String rua, String cep, int novoNumero,  String bairro){
        Pessoa pessoa = this.pessoas.get(cpf);

        if(pessoa == null){
            return "Usuario não encontrado";
        }
        
        return pessoa.setEndereco(numero, rua, cep, novoNumero, bairro);

    }

    public String apagarPessoa(String cpf){

        Pessoa pessoa = this.pessoas.get(cpf);

        if(pessoa == null){
            return "Usuario não encontrado";
        }

        this.pessoas.remove(cpf);

        return "Pessoa Deletada";
    }

    public String apagarEndereco(String cpf, int numero){
        Pessoa pessoa = this.pessoas.get(cpf);

        if(pessoa == null){
            return "Usuario não encontrado";
        }

        pessoa.apagarEndereco(numero);

        return "Endereco Aapagado";
    }

}
