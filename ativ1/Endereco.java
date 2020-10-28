public class Endereco {

    private String cep;
    private int numero;
    private String complemento;

    public Endereco(String cep, int numero) {
        setCep(cep);
        setNumero(numero);
    }

    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
