package entities;

public class Fisica extends Contribuinte {
    
    private double gastosComSaude;

    public Fisica(String nome, double rendimentoAnual, double gastosComSaude) {
        super(nome, rendimentoAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    public double getImposto() {
        
        double taxa;
        boolean rendimentoAcimaDeVinteMil = getRendimentoAnual() < 20000.0;
        
        if(rendimentoAcimaDeVinteMil) {
            taxa = getRendimentoAnual() * 0.15;
        }
        else {
            taxa = getRendimentoAnual() * 0.25;
        }
        
        taxa -= getGastosComSaude() * 0.5;
        
        if(validarSeTaxaEstaNegativa(taxa)) {
            taxa = 0;
        }

        return taxa;
    }

    private boolean validarSeTaxaEstaNegativa(double taxa) {
        boolean taxaEstaNegativa = taxa < 0;

        return taxaEstaNegativa;
    }
}
