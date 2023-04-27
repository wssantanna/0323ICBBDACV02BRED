public class Conta {

    private double saldo = 0.0;

    public String apresentarSaldoAtual() {
        String saldoAtual = "R$" + " " + Double.toString(saldo);
        
        return saldoAtual;
    }

    public String depositar(double valorDoDeposito) {
        double saldoMaisDeposito = saldo += valorDoDeposito;
        String saldoAtual = "R$" + " " + Double.toString(saldoMaisDeposito);
        
        return saldoAtual;
    }

    public String sacar(double valorDoSaque) {
        boolean tenhoSaldoSuficiente = saldo >= valorDoSaque;

        if(tenhoSaldoSuficiente) {
            double saldoMenosSaque = saldo -= valorDoSaque;
            String saldoAtual = "R$" + " " + Double.toString(saldoMenosSaque);
            
            return saldoAtual;
        }
        else {
            String mensagemDeError = "Saldo insuficiente!";
            return mensagemDeError;
        }
    }
    
}
