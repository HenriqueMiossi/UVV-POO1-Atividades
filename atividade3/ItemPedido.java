import java.util.List;

public class ItemPedido {

    private String item;
    private int quantidade;
    private double precoUnitario;

    public String getItem() {
        return item;
    }
    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public ItemPedido(String _item, int _quantidade, double _precoUnitario) {
        setItem(_item);
        setPrecoUnitario(_precoUnitario);
        setQuantidade(_quantidade);
    }
}
