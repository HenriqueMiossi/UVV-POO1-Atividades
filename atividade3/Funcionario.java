public class Funcionario {

    private String nome;
    private int matricula;

    /**
     * Getter do nome do funcionário
     *
     * @return retorna o nome do funcionário instanciado
     */
    public String getNome() {
        return nome;
    }

    /**
     * Setter do nome do funcionário
     *
     * @param nome recebe o nome do funcionário
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Getter da matrícula do funcionário
     *
     * @return retorna a matrícula do funcionário
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Setter da matrícula do funcionário
     *
     * @param matricula recebe a matrícula do funcionário
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
