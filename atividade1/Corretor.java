public class Corretor {

    private String nome;
    private String matricula;
    private Double metaMensal = 10000.0;
    private Double vendasCorretor = 0.0;
    private static Double totalVendas = 0.0;
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

    public Double getVendasTotais() {
        return totalVendas;
    }
    public void vendaCorretor() {
        this.vendasCorretor += metaMensal;
        totalVendas += metaMensal;
    }
    public Double getVendasCorretor() {
        return this.vendasCorretor;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
