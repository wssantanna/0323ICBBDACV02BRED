public class Programa {
    public static void main(String[] args) {
        ContaCorrente minhaContaCorrente = new ContaCorrente();
        minhaContaCorrente.depositar(1000);
        minhaContaCorrente.sacar(200);

        System.out.println(minhaContaCorrente.apresentarSaldoAtual());

        ContaPoupanca minhaContaPoupanca = new ContaPoupanca();
        minhaContaPoupanca.depositar(1000);
        minhaContaPoupanca.sacar(200);

        System.out.println(minhaContaPoupanca.apresentarSaldoAtual());

        ContaInvestimento minhaContaInvestimento = new ContaInvestimento();
        minhaContaInvestimento.depositar(1000);
        minhaContaInvestimento.sacar(200);

        System.out.println(minhaContaInvestimento.apresentarSaldoAtual());
    }    
}
