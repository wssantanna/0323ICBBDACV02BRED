package entities;

public abstract class Contribuinte {
    private String nome;
    private double rendimentoAnual;

    public Contribuinte(String nome, double rendimentoAnual) {
        this.nome = nome;
        this.rendimentoAnual = rendimentoAnual;
    }

    public String getNome() {
        return nome;
    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    // A Herança deverá implementar.
    public abstract double getImposto();
}
