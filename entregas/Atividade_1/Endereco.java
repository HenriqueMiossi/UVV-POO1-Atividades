public class Endereco {

    private String cep;
    private int numero;
    private String complemento;

    /**
     * Construtor da classe Endereco
     *
     * @param cep atribui o valor do CEP ao endereço do corretor
     * @param numero atribui o número da residência ao endereço do corretor
     */
    public Endereco(String cep, int numero) {
        setCep(cep);
        setNumero(numero);
    }

    /**
     * Getter da variável CEP
     *
     * @return retorna o CEP do corretor
     */
    public String getCep() {
        return cep;
    }

    /**
     * Setter da variável CEP
     *
     * @param cep atribui o CEP do corretor
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    /**
     * Getter do número da residência do corretor
     *
     * @return retorna o número da residência do corretor
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Setter do número da residência do corretor
     *
     * @param numero atribui o número da residência do corretor
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Getter do complemento
     *
     * @return retorna o complemento (informação opcional) do
     * corretor. Exemplo: "Apartamento 504"
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Setter do complemento
     *
     * @param complemento atribui um complemento (informação opcional)
     *                    do corretor. Exemplo: "Apartamento 504"
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}
