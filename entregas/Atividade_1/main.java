public class Main {
    public static void main(String[] args) {

        InOut dialogBox = new InOut();

        String cnpj = dialogBox.leString("Insira o CNPJ da empresa");
        Construtora ConstroiSuperRapido = new Construtora(cnpj);

        while(true) {

            int escolha = dialogBox.leInt("Insira sua opção:" +
                    "\n1 - Inserir corretores \n2 - Configurar meta mensal \n3 - Configurar vendas" +
                    "\n4 - Obter o total de vendas da empresa \n0 - Sair do programa");

            if(escolha == 0) {

                break;

            } else if(escolha == 1) {

                String matricula = dialogBox.leString("Insira a matrícula do primeiro corretor");
                String nome = dialogBox.leString("Insira o nome do primeiro corretor");
                Corretor corretor1 = new Corretor(matricula, nome);

                String matricula2 = dialogBox.leString("Insira a matrícula do segundo corretor");
                String nome2 = dialogBox.leString("Insira o nome do segundo corretor");
                Corretor corretor2 = new Corretor(matricula2, nome2);

                ConstroiSuperRapido.setCorretor(corretor1, corretor2);

            } else if(escolha == 2) {

                try {

                    int corretor = dialogBox.leInt("Qual corretor receberá uma nova meta mensal?");

                    if (corretor == 1) {

                        double meta = dialogBox.leDouble("Insira a nova meta mensal em R$");
                        ConstroiSuperRapido.getCorretor().setMetaMensal(meta);

                    } else if (corretor == 2) {

                        double meta = dialogBox.leDouble("Insira a nova meta mensal em R$");
                        ConstroiSuperRapido.getCorretor2().setMetaMensal(meta);

                    } else {

                        dialogBox.MsgDeAviso("Erro", "Não foi encontrado esse corretor, tente novamente");

                    }

                } catch (Exception e) {

                    dialogBox.MsgDeAviso("Aviso", "Houve um erro ao configurar a meta mensal," +
                            " os corretores foram devidamente criados?");

                }


            } else if(escolha == 3) {

                int corretor = dialogBox.leInt("Qual corretor fez a venda? ");

                try {

                    if (corretor == 1) {

                        ConstroiSuperRapido.getCorretor().vendaCorretor();

                    } else if (corretor == 2) {

                        ConstroiSuperRapido.getCorretor().vendaCorretor();

                    } else {

                        dialogBox.MsgDeAviso("Erro", "Não foi encontrado esse corretor, tente novamente");

                    }

                } catch (Exception e) {

                    dialogBox.MsgDeAviso("Alerta", "Houve um erro ao selecionar o corretor." +
                            " Os corretores foram devidamente criados?");

                }


            } else if(escolha == 4) {

                try {

                    dialogBox.MsgDeInformacao("Total de vendas", "O total de vendas da empresa foi" +
                            " R$" + ConstroiSuperRapido.getCorretor().getVendasTotais());

                } catch (Exception e) {

                    dialogBox.MsgDeAviso("Alerta", "Não houveram vendas");

                }

            }

        }

    }

}
