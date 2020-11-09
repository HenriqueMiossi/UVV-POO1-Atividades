public class Imovel {

    private String nomeProprietario;
    private double imposto;
    private int mesesAtraso;
    private static double impostoTotal;

    /**
     * Este construtor foi criado para configurar automaticamente
     * o nome do proprietário, junto com os meses de atraso
     *
     * @param nomeProprietario  variável que armazena o nome
     * @param mesesAtraso       variável que armazena os meses em atraso
     */
    public Imovel(String nomeProprietario, int mesesAtraso) {
        setNomeProprietario(nomeProprietario);
        setMesesAtraso(mesesAtraso);
    }

    /**
     * Getter do nome do proprietário
     *
     * @return retorna o nome do proprietário
     */
    public String getNomeProprietario() {
        return nomeProprietario;
    }

    /**
     * Setter do nome do proprietário
     *
     * @param nomeProprietario  armazena o nome do proprietário
     */
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    /**
     * Getter da porcentagem de imposto a se pagar
     *
     * @return retorna o imposto calculado
     */
    public double getImposto() {
        return imposto;
    }

    /**
     * Setter do imposto, que calcula a porcentagem de Imposto
     * com base nos meses de atraso:
     *
     * 0 meses = 0% imposto
     * 1 - 5 meses = 1% imposto
     * 6 - 8 meses = 2.3% imposto
     * 9 - 10 meses = 3% imposto
     * 11 - 12 meses = 5.4% imposto
     * 13 > meses = 10% imposto
     *
     * @param mesesAtraso   variável necessária para o cálculo
     *                      do imposto
     */
    public void setImposto(int mesesAtraso) {
        if(mesesAtraso > 0 & mesesAtraso < 6) {

            this.imposto = 1;

        } else if(mesesAtraso > 5 & mesesAtraso < 9) {

            this.imposto = 2.3;

        } else if(mesesAtraso > 8 & mesesAtraso < 11) {

            this.imposto = 3;

        } else if(mesesAtraso > 10 & mesesAtraso < 13) {

            this.imposto = 5.4;

        } else {

            this.imposto = 10;

        }
    }

    /**
     * Getter dos meses em atraso
     *
     * @return retorna a quantidade de meses em atraso
     */
    public int getMesesAtraso() {
        return mesesAtraso;
    }

    /**
     * Setter dos meses em atraso
     *
     * @param mesesAtraso variável que armasena os meses em atraso
     */
    public void setMesesAtraso(int mesesAtraso) {
        this.mesesAtraso = mesesAtraso;
    }


}
