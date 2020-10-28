public class main {
    public static void main(String[] args) {

        Construtora ConstroiSuperRapido = new Construtora("123123");

        Corretor corretor1 = new Corretor("23452345", "Joasney");
        Corretor corretor2 = new Corretor("098123976", "Richardsney");

        ConstroiSuperRapido.setCorretor(corretor1, corretor2);

        System.out.println(ConstroiSuperRapido.getCorretor().getNome());
        System.out.println(ConstroiSuperRapido.getCorretor2().getNome());

        ConstroiSuperRapido.setCnpj("01270730000175");
        System.out.println(ConstroiSuperRapido.getCnpj());

        Endereco endereco = new Endereco("12394876", 12039487);

        ConstroiSuperRapido.setEndereco(endereco);
        System.out.println(ConstroiSuperRapido.getEndereco().getNumero());
    }
}
