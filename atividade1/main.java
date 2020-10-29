public class main {
    public static void main(String[] args) {

        InOut dialogBox = new InOut();
        String cnpj = dialogBox.leString("Insira o CNPJ da empresa");

        Construtora ConstroiSuperRapido = new Construtora(cnpj);

        String matricula = dialogBox.leString("Insira a matrícula do primeiro corretor");
        String nome = dialogBox.leString("Insira o nome do primeiro corretor");
        Corretor corretor1 = new Corretor(matricula, nome);

        String matricula2 = dialogBox.leString("Insira a matrícula do segundo corretor");
        String nome2 = dialogBox.leString("Insira o nome do segundo corretor");
        Corretor corretor2 = new Corretor(matricula2, nome2);

        ConstroiSuperRapido.setCorretor(corretor1, corretor2);
        
        ConstroiSuperRapido.getCorretor().vendaCorretor();
        ConstroiSuperRapido.getCorretor2().vendaCorretor();



        dialogBox.MsgDeInformacao("Total de Vendas", "O total de vendas da empresa foi de R$" +
                ConstroiSuperRapido.getCorretor().getVendasTotais());
    }
}
