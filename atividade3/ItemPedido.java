public class ItemPedido {

    private String item;
    private int quantidade;
    private double precoUnitario;

    /**
     * Getter do item
     *
     * @return retorna o nome do item
     * Ex: "Lápis", "Caneta"...
     */
    public String getItem() {
        return item;
    }

    /**
     * Setter do item
     *
     * @param item recebe o nome do item
     *             Ex: "Lápis", "Caneta"...
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * Getter da quantidade de itens
     *
     * @return retorna a quantidade de itens
     */
    public int getQuantidade() {
        return quantidade;
    }
    /**
     * Setter da quantidade de itens
     *
     * @param quantidade recebe a quantidade de itens
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Getter do preço unitário do produto
     *
     * @return retorna o preço unitário do produto
     */
    public double getPrecoUnitario() {
        return precoUnitario;
    }

    /**
     * Setter do preço unitário do produto
     *
     * @param precoUnitario recebe o preço unitário do produto
     */
    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    /**
     * Construtor da classe ItemPedido, que tem como função
     * cadastrar um novo item
     *
     * @param _item recebe o nome do item
     * @param _quantidade recebe a quantidade de itens
     * @param _precoUnitario recebe o preço unitário do item
     */
    public ItemPedido(String _item, int _quantidade, double _precoUnitario) {
        setItem(_item);
        setPrecoUnitario(_precoUnitario);
        setQuantidade(_quantidade);
    }
}
