import java.util.ArrayList;
import java.util.List;

public class Loja {

    private static List<String> lista = new ArrayList<String>();
    private static int indice;

    /**
     * Menu principal, mostra as opções e guia o usuário pelo programa
     */
    public static void menu() {

        InOut dialogo = new InOut();

        dialogo.MsgDeInformacao("Menu", "Bem vindo ao sistema de pedidos.");
        while (true) {
            int escolha = dialogo.leInt("Qual sua opção? \n1 - Cadastrar pedido \n" +
                    "2 - Remover pedido \n3 - Mostrar lista de pedidos \n0 - Sair do programa");

            /**
             * Direciona o usuário pelos pedidos
             */
            if(escolha == 0) {

                break;

            } else if(escolha == 1) {

                inserirPedido(indice);

            } else if(escolha == 2) {

                removerPedido();

            } else if(escolha == 3) {

                buscarPedido();

            } else {

                dialogo.MsgDeAviso("Erro", "Escolha inválida, tente novamente");

            }
        }
    }

    /**
     * Método que cria um novo pedido, com nome, quantidade e preço
     *
     * @param _indice recebe o índice do pedido, com o fim de incrementar
     *                a cada vez que cria-se um novo pedido. O ID do pedido
     *                é o índice * 100
     */
    public static void inserirPedido(int _indice) {

        InOut dialogo = new InOut();

        indice += 1;
        String data = dialogo.leString("Insira a data do pedido");
        Pedido pedido = new Pedido(indice * 100, data);
        lista.add(String.valueOf(indice));

        /**
         * Menu do pedido, que guia o usuário na manipulação dos itens do pedido
         */
        while(true) {

            // Mostra as opções do usuário
            int escolha = dialogo.leInt("Qual sua escolha? \n1 - Inserir item" +
                    "\n2 - Remover item \n3 - Buscar itens \n4 - Calcular preço total \n" +
                    "5 - Calcular desconto \n0 - Concluir pedido");

            // Finaliza o programa
            if (escolha == 0) {
                break;
            }

            // Insere um item no pedido
            if (escolha == 1) {

                String nome = dialogo.leString("Qual o nome do item?");
                int quantidade = dialogo.leInt("Qual a quantidade?");
                double preco = dialogo.leDouble("Qual o preço do item?");
                double item = pedido.inserirItemPedido(nome, quantidade, preco);
                pedido.atualizaLista(nome);

                // Remove um item do pedido
            } else if (escolha == 2) {

                String nome = dialogo.leString("Qual objeto será removido?");
                int quantidade = dialogo.leInt("Qual era a quantidade total dos itens?");
                double preco = dialogo.leInt("Qual era o preço original dos itens?");
                pedido.removerItemPedido(nome, quantidade * preco);

                // Mostra os itens atualmente no pedido
            } else if (escolha == 3) {

                pedido.buscarItemPedido();

                // Calcula o valor total sem desconto de funcionário
            } else if (escolha == 4) {

                double valor = pedido.calcularValorTotal();
                dialogo.MsgDeInformacao("Valor total", String.valueOf(valor));

                // Faz o cálculo do desconto do funcionário
            } else if (escolha == 5) {

                int tipoFuncionario = dialogo.leInt("Que tipo de funcionário receberá o desconto? " +
                        "\n1 - Gerente \n2 - Estagiário");

                if(tipoFuncionario == 1) {

                    // Calcula o desconto de Gerente
                    Gerente gerente = new Gerente();
                    double valor = gerente.calcularDesconto(pedido.calcularValorTotal());
                    dialogo.MsgDeInformacao("Desconto", "O valor descontado foi de: " + Math.round(valor));

                } else if(tipoFuncionario == 2) {

                    // Calcula o desconto de Estagiário
                    Estagiario estagiario = new Estagiario();
                    double valor = estagiario.calcularDesconto(pedido.calcularValorTotal());
                    dialogo.MsgDeInformacao("Desconto", "O valor descontado foi de: " + Math.round(valor));

                } else {

                    // Alerta para valores inválidos
                    dialogo.MsgDeAviso("Aviso", "Tipo de funcionário inválido");

                }

            } else {

                dialogo.MsgDeAviso("Aviso", "Escolha inválida, tente novamente");

            }

        }
    }

    /**
     * Método que exclui um pedido e todos os seus dados
     */
    public static void removerPedido() {

        InOut dialogo = new InOut();

        int escolha = dialogo.leInt("Digite a posição do pedido a ser retirado:\n" + lista.toString());

        try {

            lista.remove(escolha - 1);

        } catch (Exception e) {

            dialogo.MsgDeAviso("Erro", "Não há valores na posição " + escolha + ". ");

        }


    }

    /**
     * Método que busca os pedidos e mostra para o usuário
     */
    public static void buscarPedido() {

        InOut dialogo = new InOut();

        dialogo.MsgDeInformacao("Itens", lista.toString());

    }

    // Função main, contém o menu, e a partir dele o usuário prossegue
    // e interage com o resto do sistema
    public static void main(String[] args) {

        menu();

    }

}
