public class Main {

    public static void main(String[] args) {

        while(true) {

            int escolha = InOut.leInt("Qual a sua escolha? \n0 - Sair do programa" +
                    "\n1 - Inserir proprietário");

            if(escolha == 0) {

                break;

            } else if(escolha == 1) {

                String proprietario = InOut.leString("Insira o nome do proprietário");
                int mesesAtraso = InOut.leInt("Insira a quantidade de meses em atraso");

                Imovel casa = new Imovel(proprietario, mesesAtraso);
                casa.setImposto(mesesAtraso);


                InOut.MsgDeInformacao("Meses em atraso", casa.getNomeProprietario() +
                        " possui " + casa.getMesesAtraso() + " meses em atraso, contabilizando " +
                        casa.getImposto() + "% de multa");

            } else {

                InOut.MsgDeAviso("Erro", "Entrada inválida, tente novamente");

            }

        }

    }

}
