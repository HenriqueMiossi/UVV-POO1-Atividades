public class Main {
    public static void main(String[] args) {

        InOut dialogBox = new InOut();

        String proprietario = dialogBox.leString("Insira o nome do proprietário");
        int mesesAtraso = dialogBox.leInt("Insira a quantidade de meses em atraso");

        Imovel casa = new Imovel(proprietario, mesesAtraso);
        
        System.out.println(casa.getMesesAtraso());
        casa.setImposto(20);
        System.out.println(casa.getImposto());

    }
}
