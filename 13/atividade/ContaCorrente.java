public class ContaCorrente {

    private double saldoDisponivel = 0;
    private double limiteCredito = 0;
    
    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }
    
    public void depositar(double valor) {
        saldoDisponivel += valor;
    }
    
    public void sacar(double valor) {
        saldoDisponivel -= valor;
    }
}
