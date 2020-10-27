public class Corretor {

    private String nome;
    private String matricula;
    private Double metaMensal;
    private Integer vendasEfetuadas;
    private String endereco;

    public Corretor(String matricula, String nome) {
        setMatricula(matricula);
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Double getMetaMensal() {
        return metaMensal;
    }
    public void setMetaMensal(Double metaMensal) {
        this.metaMensal = metaMensal;
    }

    public Integer getVendasEfetuadas() {
        return vendasEfetuadas;
    }
    public void setVendasEfetuadas(Integer vendasEfetuadas) {
        this.vendasEfetuadas = vendasEfetuadas;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
