package entities;

public class Juridica extends Contribuinte {
    
    private int numeroDeFuncionarios;

    public Juridica(String nome, double rendimentoAnual, int numeroDeFuncionarios) {
        super(nome, rendimentoAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public double getImposto() {
        boolean numeroDeFuncionariosAcimaDeDez = numeroDeFuncionarios > 10;

        if(numeroDeFuncionariosAcimaDeDez) {
            return getRendimentoAnual() * 0.14;
        }
        else {
            return getRendimentoAnual() * 0.16;
        }
    }
}
