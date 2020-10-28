public class Construtora {

    private String cnpj;
    private Endereco endereco;
    private Corretor corretor;
    private Corretor corretor2;

    public Construtora(String cnpj) {
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
    public Corretor getCorretor2() {
        return corretor2;
    }
    public void setCorretor(Corretor corretor, Corretor corretor2) {
        this.corretor = corretor;
        this.corretor2 = corretor2;
    }


}
