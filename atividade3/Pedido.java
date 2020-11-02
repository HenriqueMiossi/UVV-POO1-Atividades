import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int pedidoId;
    private String dataEmissão;
    private static double valorTotalCalculado;
    public List<String> valores = new ArrayList<>();

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
    public void removerItemPedido(double item) {
        valorTotalCalculado -= item;
    }

    public void atualizaLista(String nome) {
        valores.add(nome);
    }

    public List<String> getLista() {
        return valores;
    }

    public double getValorTotalCalculado() {
        return this.valorTotalCalculado;
    }

}
