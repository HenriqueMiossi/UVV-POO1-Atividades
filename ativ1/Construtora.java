public class Construtora {

    private String cnpj;
    private Endereco endereco;
    private Corretor corretor;

    public Construtora(String cnpj, Endereco endereco) {
        setCnpj(cnpj);
        setEndereco(endereco);
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Corretor getCorretor() {
        return corretor;
    }
    public void setCorretor(Corretor corretor) {
        this.corretor = corretor;
    }
}
