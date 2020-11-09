public class Estagiario extends Funcionario {

    /**
     * A classe Estagiario herda de funcionário suas características
     * e adiciona um desconto exclusivo dos estagiários
     *
     * @param valor recebe o valor do pedido
     * @return retorna o cálculo do desconto de 10%
     */
    public double calcularDesconto(double valor) {
        return valor * 0.90;
    }

}
