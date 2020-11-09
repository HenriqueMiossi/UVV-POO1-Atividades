public class Gerente extends Funcionario {

    private String senha;

    /**
     * Setter da senha do gerente
     *
     * @param _senha recebe a senha a ser atribuída ao gerente
     */
    public void setSenha(String _senha) {
        this.senha = _senha;
    }

    /**
     * A classe Estagiario herda de funcionário suas características
     * e adiciona um desconto exclusivo dos estagiários
     *
     * @param valor recebe o valor do pedido
     * @return retorna o cálculo do desconto de 10%
     */
    public double calcularDesconto(double valor) {
        return valor * 0.8;
    }

}