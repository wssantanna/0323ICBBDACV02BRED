public class Conta {

    private double saldoDisponivel = 0;
    
    public double getSaldoDisponivel() {
        return saldoDisponivel;
    }
    
    public void depositar(double valor) {
        saldoDisponivel += valor;
    }
    
    public void sacar(double valor) {
        saldoDisponivel -= valor;
    }
    
}
