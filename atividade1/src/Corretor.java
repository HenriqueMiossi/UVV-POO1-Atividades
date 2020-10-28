public class Corretor {

    private String nome;
    private String matricula;
    private Double metaMensal = 10000.0;
    private static Double vendasCorretor1 = 0.0;
    private static Double vendasCorretor2 = 0.0;
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
        return vendasCorretor1 + vendasCorretor2;
    }
    public void vendaCorretor1() {
        vendasCorretor1 += metaMensal;
    }
    public Double getVendasCorretor1() {
        return vendasCorretor1;
    }
    public Double getVendasCorretor2() {
        return vendasCorretor2;
    }
    public void vendaCorretor2() {
        vendasCorretor2 += metaMensal;
    }

    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
