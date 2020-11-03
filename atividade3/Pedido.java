import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int pedidoId;
    private String dataEmissão;
    private static double valorTotalCalculado;
    public List<String> valores = new ArrayList<>();

    InOut dialogo = new InOut();

    public int getPedidoId() {
        return pedidoId;
    }
    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getDataEmissão() {
        return dataEmissão;
    }
    public void setDataEmissão(String dataEmissão) {
        this.dataEmissão = dataEmissão;
    }

    public Pedido(int _id, String _data) {
        this.dataEmissão = _data;
        this.pedidoId = _id;
    }

    public double inserirItemPedido(String nome, int quantidade, double preco) {
        ItemPedido item = new ItemPedido(nome, quantidade, preco);
        valorTotalCalculado += item.getPrecoUnitario() * item.getQuantidade();
        return item.getPrecoUnitario() * item.getQuantidade();
    }

    public void removerItemPedido(String nome, double valorRemovido) {

        if(valores.contains(nome)) {

            valores.remove(nome);
            int posicao = valores.indexOf(nome);
            valorTotalCalculado -= valorRemovido;

        }

    }

    public void atualizaLista(String nome) {
        valores.add(nome);
    }
    public void removeDaLista(String nome) {
        valores.remove(nome);
    }

    public void buscarItemPedido() {
        String itens = valores.toString();
        dialogo.MsgDeInformacao("Valores", "Os itens do pedido são: " + itens);
    }

    public double calcularValorTotal() {
        return this.valorTotalCalculado;
    }

}
