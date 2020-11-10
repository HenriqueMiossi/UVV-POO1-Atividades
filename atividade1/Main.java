public class Main {
    public static void main(String[] args) {

        Construtora ConstroiSuperRapido = new Construtora();

        while(true) {

            String cnpj = InOut.leString("Insira o CNPJ da empresa");
            if(ValidaCnpj.isCNPJ(cnpj)) {
                ConstroiSuperRapido.setCnpj(cnpj);
                break;
            } else {

                InOut.MsgDeErro("Erro", "O CNPJ inserido é inválido");

            }

        }

        while(true) {

            int escolha = InOut.leInt("Insira sua opção:" +
                    "\n1 - Inserir corretores \n2 - Modificar meta mensal \n3 - Aplicar venda" +
                    "\n4 - Obter o total de vendas da empresa \n0 - Sair do programa");

            if(escolha == 0) {

                break;

            } else if(escolha == 1) {

                String matricula = InOut.leString("Insira a matrícula do primeiro corretor");
                String nome = InOut.leString("Insira o nome do primeiro corretor");
                Corretor corretor1 = new Corretor(matricula, nome);

                String matricula2 = InOut.leString("Insira a matrícula do segundo corretor");
                String nome2 = InOut.leString("Insira o nome do segundo corretor");
                Corretor corretor2 = new Corretor(matricula2, nome2);

                ConstroiSuperRapido.setCorretor(corretor1, corretor2);

            } else if(escolha == 2) {

                try {

                    int corretor = InOut.leInt("Qual corretor receberá uma nova meta mensal?");

                    if (corretor == 1) {

                        double meta = InOut.leDouble("Insira a nova meta mensal em R$");
                        ConstroiSuperRapido.getCorretor().setMetaMensal(meta);

                    } else if (corretor == 2) {

                        double meta = InOut.leDouble("Insira a nova meta mensal em R$");
                        ConstroiSuperRapido.getCorretor2().setMetaMensal(meta);

                    } else {

                        InOut.MsgDeAviso("Erro", "Não foi encontrado esse corretor, tente novamente");

                    }

                } catch (Exception e) {

                    InOut.MsgDeAviso("Aviso", "Houve um erro ao configurar a meta mensal," +
                            " os corretores foram devidamente criados?");

                }


            } else if(escolha == 3) {

                int corretor = InOut.leInt("Qual corretor fez a venda? ");

                try {

                    if (corretor == 1) {

                        ConstroiSuperRapido.getCorretor().vendaCorretor();

                    } else if (corretor == 2) {

                        ConstroiSuperRapido.getCorretor().vendaCorretor();

                    } else {

                        InOut.MsgDeAviso("Erro", "Não foi encontrado esse corretor, tente novamente");

                    }

                } catch (Exception e) {

                    InOut.MsgDeAviso("Alerta", "Houve um erro ao selecionar o corretor." +
                            " Os corretores foram devidamente criados?");

                }


            } else if(escolha == 4) {

                try {

                    InOut.MsgDeInformacao("Total de vendas", "O total de vendas da empresa foi" +
                            " R$" + ConstroiSuperRapido.getCorretor().getVendasTotais());

                } catch (Exception e) {

                    InOut.MsgDeAviso("Alerta", "Não houveram vendas");

                }

            }

        }

    }

}
