public class ContaPoupanca {
    private double saldoDisponivel = 0;
    private double taxaJuros = 0.45;
    
    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
    
    public void depositar(double valor) {
        saldoDisponivel += valor;
    }
    
    public void sacar(double valor) {
        saldoDisponivel -= valor;
    }
}
