public class Imovel {

    private String nomeProprietario;
    private double imposto;
    private int mesesAtraso;

    public Imovel(String nomeProprietario, int mesesAtraso) {
        setNomeProprietario(nomeProprietario);
        setMesesAtraso(mesesAtraso);
    }

    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public double getImposto() {
        return imposto;
    }

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

    public int getMesesAtraso() {
        return mesesAtraso;
    }
    public void setMesesAtraso(int mesesAtraso) {
        this.mesesAtraso = mesesAtraso;
    }

}
