public class ContaInvestimento {

    private double taxaRendimento = 0.12;
    
    private double saldoDisponivel = 0;
    
    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    
    public void depositar(double valor) {
        saldoDisponivel += valor;
    }
    
    public void sacar(double valor) {
        saldoDisponivel -= valor;
    }
}
