public class Construtora {

    private String cnpj;
    private Endereco endereco;
    private Corretor corretor;
    private Corretor corretor2;

    /**
     * Construtor da classe Construtora
     */
    public Construtora() {

    }

    /**
     * Getter da variável CNPJ
     *
     * @return retorna o valor do CNPJ
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * Setter do CNPJ, atribui o valor do CNPJ
     * caso passe na validação feita pela classe
     * ValidaCnpj
     *
     * @param cnpj recebe o valor do CNPJ para analisar
     */
    public void setCnpj(String cnpj) {
        if(ValidaCnpj.isCNPJ(cnpj) == true) {
            this.cnpj = cnpj;
        }
    }

    /**
     * Getter da variável endereço
     *
     * @return retorna o endereço da construtora
     */
    public Endereco getEndereco() {
        return endereco;
    }
    /**
     * Setter da variável endereço
     *
     * @param endereco recebe o endereço da construtora
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    /**
     * Getter do Corretor 1
     *
     * @return retorna o corretor Nº 1
     */
    public Corretor getCorretor() {
        return corretor;
    }
    /**
     * Getter do Corretor 2
     *
     * @return retorna o corretor Nº 2
     */
    public Corretor getCorretor2() {
        return corretor2;
    }

    /**
     * Setter dos corretores
     *
     * @param corretor atribui um corretor como o corretor 1
     * @param corretor2 atribui outro corretor como o corretor 2
     */
    public void setCorretor(Corretor corretor, Corretor corretor2) {
        this.corretor = corretor;
        this.corretor2 = corretor2;
    }

}
