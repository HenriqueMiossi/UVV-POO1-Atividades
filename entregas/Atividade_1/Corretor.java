public class Corretor {

    private String nome;
    private String matricula;
    private Double metaMensal = 10000.0;
    private Double vendasCorretor = 0.0;
    private static Double totalVendas = 0.0;
    private Endereco endereco;

    /**
     * Construtor da classe Corretor
     *
     * @param _matricula recebe a matrícula do corretor instanciado
     * @param _nome recebe o nome do corretor instanciado
     */
    public Corretor(String _matricula, String _nome) {
        setMatricula(_matricula);
        setNome(_nome);
    }

    /**
     * Getter do nome do corretor
     *
     * @return retorna o nome do corretor
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter do nome do corretor
     *
     * @param _nome recebe o nome do corretor
     */
    public void setNome(String _nome) {
        this.nome = _nome;
    }

    /**
     * Getter da matrícula
     *
     * @return retorna o valor da matrícula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Setter da matrícula
     *
     * @param _matricula recebe a matrícula
     */
    public void setMatricula(String _matricula) {
        this.matricula = _matricula;
    }

    /**
     * Getter da meta mensal do corretor
     *
     * @return retorna a meta mensal
     */
    public Double getMetaMensal() {
        return metaMensal;
    }

    /**
     * Setter da meta mensal do corretor
     *
     * @param metaMensal recebe a meta mensal a ser atribuída
     */
    public void setMetaMensal(Double metaMensal) {
        this.metaMensal = metaMensal;
    }

    /**
     * Getter das vendas totais dos corretores
     *
     * @return retorna o total de vendas, sendo esse total a
     * soma das vendas de todos os corretores
     */
    public Double getVendasTotais() {
        return totalVendas;
    }

    /**
     * Atribui uma venda para o corretor, sendo o valor dessa venda
     * o valor da meta mensal. Exemplo: 3 meses de trabalho equivalem
     * a 3 vendas, que equivalem a 3 metas mensais
     */
    public void vendaCorretor() {
        this.vendasCorretor += metaMensal;
        totalVendas += metaMensal;
    }

    /**
     * Getter da variável vendasCorretor
     *
     * @return retorna as vendas em Real que pertencem ao corretor especificado
     */
    public Double getVendasCorretor() {
        return this.vendasCorretor;
    }

    /**
     * Getter da variável endereco
     *
     * @return retorna o endereço do corretor, podendo-se usar seus métodos,
     * como getCep, getNumero e getComplemento
     */
    public Endereco getEndereco() {
        return endereco;
    }

    /**
     * Setter da variável endereço
     *
     * @param endereco armazena a instância da classe endereço. Em outras palavras,
     *                 armazena o endereço do corretor, bem como seus atributos
     */
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
