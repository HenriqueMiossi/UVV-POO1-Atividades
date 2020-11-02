import java.util.ArrayList;
import java.util.List;

public class Loja {

    private List<Pedido> listaPedidos;

    public static void main(String[] args) {

        List<Pedido> lista = new ArrayList<Pedido>();

        Pedido pedido1 = new Pedido(123, "12/4/2020");
        lista.add(pedido1);

        double caderno = pedido1.inserirItemPedido("Caderno", 4, 6);
        pedido1.atualizaLista("Caderno");

        double lapis = pedido1.inserirItemPedido("Lapis", 10, 0.5);
        pedido1.atualizaLista("Lápis");

        System.out.println(pedido1.getLista());

        System.out.println(pedido1.getValorTotalCalculado());

    }

}
