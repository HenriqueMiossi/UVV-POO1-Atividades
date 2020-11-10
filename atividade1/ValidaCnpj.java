import java.util.InputMismatchException;

public class ValidaCnpj {

    /**
     * Confere se o CNPJ inserido realmente é válido
     *
     * @param CNPJ recebe um CNPJ para ser conferido
     * @return retorna 'false' caso o CNPJ seja inválido
     * ou 'true' caso o CNPJ seja válido
     */
    public static boolean isCNPJ(String CNPJ) {
        // Considera-se inválido os CNPJ's formados por uma sequencia de numeros iguais
        if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") ||
                CNPJ.equals("22222222222222") || CNPJ.equals("33333333333333") ||
                CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555") ||
                CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") ||
                CNPJ.equals("88888888888888") || CNPJ.equals("99999999999999") ||
                (CNPJ.length() != 14))
                return(false);

        char dig13, dig14;
        int sm, i, r, num, peso;

        // "try" - protege o código para eventuais erros de conversao de tipo (int)
        try {
        // Cálculo do 1º Dígito Verificador
            sm = 0;
            peso = 2;
            for (i=11; i>=0; i--) {
        // Converte o i-ésimo caractere do CNPJ em um número:
        // por exemplo, transforma o caractere '0' no inteiro 0
        // (48 eh a posição de '0' na tabela ASCII)
                num = CNPJ.charAt(i) - 48;
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig13 = '0';
            else dig13 = (char)((11-r) + 48);

            // Cálculo do 2º Dígito Verificador
            sm = 0;
            peso = 2;
            for (i=12; i>=0; i--) {
                num = CNPJ.charAt(i)- 48;
                sm = sm + (num * peso);
                peso = peso + 1;
                if (peso == 10)
                    peso = 2;
            }

            r = sm % 11;
            if ((r == 0) || (r == 1))
                dig14 = '0';
            else dig14 = (char)((11-r) + 48);

            // Verifica se os dígitos calculados conferem com os dígitos informados.
            return (dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13));
        } catch (InputMismatchException erro) {
            return(false);
        }
    }

    /**
     * Imprime o CNPJ formatado
     *
     * @param CNPJ recebe o CNPJ válido para a conversão
     * @return retorna o CNPJ formatado com os caracteres especiais
     */
    public static String imprimeCNPJ(String CNPJ) {
        // Máscara do CNPJ: 99.999.999.9999-99
        return(CNPJ.substring(0, 2) + "." + CNPJ.substring(2, 5) + "." +
                CNPJ.substring(5, 8) + "." + CNPJ.substring(8, 12) + "-" +
                CNPJ.substring(12, 14));
    }
}