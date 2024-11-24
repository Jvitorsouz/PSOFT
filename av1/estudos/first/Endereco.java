public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cep;

    public Endereco(String rua, int numero, String bairro, String cep){
        this.rua = rua;
        this.numero = numero;
        this.bairro = bairro;
        this.cep = cep;
    }

    public String toString(){
        return this.rua + this.numero + this.bairro + this.cep;
    }

    public void setRua(String newRua){
        this.rua = newRua;
    }

    public void setNumero(int newNumero){
        this.numero = newNumero;
    }

    public void setBairro(String newBairro){
        this.bairro = newBairro;
    }

    public void setCep(String newCep){
        this.cep = newCep;
    }

    
}
