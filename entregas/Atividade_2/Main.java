public class Main {

    public static void main(String[] args) {

        InOut dialogBox = new InOut();

        while(true) {

            int escolha = dialogBox.leInt("Qual a sua escolha? \n0 - Sair do programa" +
                    "\n1 - Inserir proprietário");

            if(escolha == 0) {

                break;

            } else if(escolha == 1) {

                String proprietario = dialogBox.leString("Insira o nome do proprietário");
                int mesesAtraso = dialogBox.leInt("Insira a quantidade de meses em atraso");

                Imovel casa = new Imovel(proprietario, mesesAtraso);
                casa.setImposto(mesesAtraso);


                dialogBox.MsgDeInformacao("Meses em atraso", casa.getNomeProprietario() +
                        " possui " + casa.getMesesAtraso() + " meses em atraso, contabilizando " +
                        casa.getImposto() + "% de multa");

            } else {

                dialogBox.MsgDeAviso("Erro", "Entrada inválida, tente novamente");

            }

        }

    }

}
