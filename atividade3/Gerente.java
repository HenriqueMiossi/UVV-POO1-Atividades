public class Gerente extends Funcionario {

    private String senha;

    public Gerente(String _senha) {
        this.senha = _senha;
    }

    public double calcularDesconto(double valor) {
        return valor * 0.8;
    }

}