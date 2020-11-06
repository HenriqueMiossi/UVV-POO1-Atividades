import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private int pedidoId;
    private String dataEmissão;
    private static double valorTotalCalculado;
    public List<String> valores = new ArrayList<>();

    InOut dialogo = new InOut();

    /**
     * Getter do ID do pedido
     *
     * @return retorna o ID do pedido
     */
    public int getPedidoId() {
        return pedidoId;
    }

    /**
     * Setter do ID do pedido
     *
     * @param pedidoId recebe o ID do pedido
     */
    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    /**
     * Getter da data de emissão do pedido
     *
     * @return retorna a data de emissão do pedido
     */
    public String getDataEmissão() {
        return dataEmissão;
    }

    /**
     * Setter da data de emissão
     *
     * @param dataEmissão recebe a data de emissão
     */
    public void setDataEmissão(String dataEmissão) {
        this.dataEmissão = dataEmissão;
    }

    /**
     * Construtor da classe Pedido, que exige um ID e uma data
     * de emissão para identificar o pedido
     *
     * @param _id recebe o ID do pedido
     * @param _data recebe a data de emissão do pedido
     */
    public Pedido(int _id, String _data) {
        setDataEmissão(_data);
        setPedidoId(_id);
    }

    /**
     * A função inserirItemPedido atribui ao pedido um novo item,
     * contendo um nome, seu preço unitário e sua quantidade. Além
     * disso, também calcula na execução o valor total desse pedido
     *
     * @param nome recebe o nome do item
     * @param quantidade recebe a quantidade de itens
     * @param preco recebe o preço unitário dos itens
     * @return retorna o preço total desses itens para
     * cálculos posteriores
     */
    public double inserirItemPedido(String nome, int quantidade, double preco) {

        ItemPedido item = new ItemPedido(nome, quantidade, preco);
        valorTotalCalculado += item.getPrecoUnitario() * item.getQuantidade();
        return item.getPrecoUnitario() * item.getQuantidade();

    }

    /**
     * A função removerItemPedido remove da lista de itens do
     * pedido o nome desse item e desconta do valor total o
     * preço desses itens
     *
     * @param nome
     * @param valorRemovido
     */
    public void removerItemPedido(String nome, double valorRemovido) {

        if(valores.contains(nome)) {

            removeDaLista(nome);
            valorTotalCalculado -= valorRemovido;

        }

    }

    /**
     * Função necessária para fazer o controle da lista de itens
     * dos pedidos, adicionando sempre o nome do item
     *
     * @param nome recebe o nome do item que entrará na lista
     */
    public void atualizaLista(String nome) {
        valores.add(nome);
    }

    /**
     * Função usada para remover um item da lista de itens dos
     * pedidos, fazendo o oposto da função atualizaLista()
     *
     * @param nome recebe o nome do item que sairá da lista
     */
    public void removeDaLista(String nome) {
        valores.remove(nome);
    }

    /**
     * Função que mostra os valores contidos na lista de itens
     */
    public void buscarItemPedido() {
        String itens = valores.toString();
        dialogo.MsgDeInformacao("Valores", "Os itens do pedido são: " + itens);
    }

    /**
     * Função que retorna o valor total do pedido
     *
     * @return retorna o valor total calculado
     */
    public double calcularValorTotal() {
        return this.valorTotalCalculado;
    }

}
