public class Financiamento {

    private double valorTotal;
    private double valorEntrada;
    private int numeroDeParcelas;

    public Financiamento(double valorTotal, double valorEntrada, int numeroDeParcelas) {
        this.valorTotal = valorTotal;
        this.valorEntrada = valorEntrada;
        this.numeroDeParcelas = numeroDeParcelas;

        // Regras de Negócio
        boolean temValorDeEntradaMinimo = valorEntrada < valorTotal * 0.2;
        boolean temNumeroDeParcelasMinimo = numeroDeParcelas < 6;

        if(temValorDeEntradaMinimo) {
            throw new RuntimeException("Entrada deve ser de pelo menos 20% do valor total");
        }
        else if(temNumeroDeParcelasMinimo) {
            throw new RuntimeException("O número de parcelas minima deve ser de 3");
        }
    }

    public double getValorDasPrestacoes() {
        double valorDasPrestacoes = (valorTotal - valorEntrada) / numeroDeParcelas;

        return valorDasPrestacoes;
    }

}