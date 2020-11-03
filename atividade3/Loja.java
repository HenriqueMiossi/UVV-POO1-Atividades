import java.util.ArrayList;
import java.util.List;

public class Loja {

    private static List<String> lista = new ArrayList<String>();
    private static int indice;


    public static void menu() {

        InOut dialogo = new InOut();

        dialogo.MsgDeInformacao("Menu", "Bem vindo ao sistema de pedidos.");
        while (true) {
            int escolha = dialogo.leInt("Qual sua opção? \n1 - Cadastrar pedido \n" +
                    "2 - Remover pedido \n3 - Mostrar lista de pedidos \n0 - Sair do programa");

            if(escolha == 0) {

                break;

            } else if(escolha == 1) {

                inserirPedido(indice);

            } else if(escolha == 2) {

                removerPedido();

            } else if(escolha == 3) {

                buscarPedido();

            } else {

                dialogo.MsgDeAviso("Erro", "Entrada inválida, tente novamente");

            }
        }
    }

    public static void inserirPedido(int _indice) {

        InOut dialogo = new InOut();

        indice += 1;
        String data = dialogo.leString("Insira a data do pedido");
        Pedido pedido = new Pedido(indice * 100, data);
        lista.add(String.valueOf(indice));

        while(true) {

            int escolha = dialogo.leInt("Qual sua escolha? \n1 - Inserir item" +
                    "\n2 - Remover item \n3 - Buscar itens \n4 - Calcular preço total \n" +
                    "5 - Calcular desconto \n0 - Concluir pedido");

            if (escolha == 0) {
                break;
            }

            if (escolha == 1) {

                String nome = dialogo.leString("Qual o nome do item?");
                int quantidade = dialogo.leInt("Qual a quantidade?");
                double preco = dialogo.leDouble("Qual o preço do item?");
                double item = pedido.inserirItemPedido(nome, quantidade, preco);
                pedido.atualizaLista(nome);

            } else if (escolha == 2) {

                String nome = dialogo.leString("Qual objeto será removido?");
                int quantidade = dialogo.leInt("Qual era a quantidade total dos itens?");
                double preco = dialogo.leInt("Qual era o preço original dos itens?");
                pedido.removerItemPedido(nome, quantidade * preco);

            } else if (escolha == 3) {

                pedido.buscarItemPedido();

            } else if (escolha == 4) {

                double valor = pedido.calcularValorTotal();
                dialogo.MsgDeInformacao("Valor total", String.valueOf(valor));

            } else if (escolha == 5) {

                int tipoFuncionario = dialogo.leInt("Que tipo de funcionário receberá o desconto? " +
                        "\n1 - Gerente \n2 - Estagiário");

                if(tipoFuncionario == 1) {
                    Gerente gerente = new Gerente();
                    double valor = (pedido.calcularValorTotal() / 100) * 80;
                    dialogo.MsgDeInformacao("Desconto", "O valor descontado foi de: " + Math.round(valor));
                } else if(tipoFuncionario == 2) {
                    Estagiario estagiario = new Estagiario();
                    double valor = (pedido.calcularValorTotal() / 100) * 95;
                    dialogo.MsgDeInformacao("Desconto", "O valor descontado foi de: " + Math.round(valor));
                } else {
                    dialogo.MsgDeAviso("Aviso", "Tipo de funcionário inválido");
                }

            }
        }
    }

    public static void removerPedido() {

        InOut dialogo = new InOut();

        int escolha = dialogo.leInt("Digite a posição do pedido a ser retirado:\n" + lista.toString());

        try {

            lista.remove(escolha - 1);

        } catch (Exception e) {

            dialogo.MsgDeAviso("Erro", "Não há valores na posição " + escolha + ". ");

        }


    }

    public static void buscarPedido() {

        InOut dialogo = new InOut();

        dialogo.MsgDeInformacao("Itens", lista.toString());

    }

    public static void main(String[] args) {

        menu();

    }

}
