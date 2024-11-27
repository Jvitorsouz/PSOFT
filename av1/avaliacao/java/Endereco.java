public class Endereco {

    private String rua;
    private String cep;
    private int numero;
    private String bairro;

    public Endereco(String rua, String cep, int numero, String bairro){
        this.rua = rua;
        this.cep = cep;
        this.numero = numero;
        this.bairro = bairro;
    }

    public String toString(){
        String retorno = "Rua: " + this.rua + "\n"+
                         "Cep: " + this.cep + "\n"+
                         "Número: " + this.numero + "\n"+
                         "Bairro: " + this.bairro + "\n";

        return retorno;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    
    
}
