public class Programa {
    public static void main(String[] args) {
        Corrente minhaContaCorrente = new Corrente();
        minhaContaCorrente.depositar(1000);
        minhaContaCorrente.sacar(200);

        System.out.println(minhaContaCorrente.getSaldoDisponivel());

        Poupanca minhaContaPoupanca = new Poupanca();
        minhaContaPoupanca.depositar(1000);
        minhaContaPoupanca.sacar(200);

        System.out.println(minhaContaPoupanca.getSaldoDisponivel());

        Investimento minhaContaInvestimento = new Investimento();
        minhaContaInvestimento.depositar(1000);
        minhaContaInvestimento.sacar(200);

        System.out.println(minhaContaInvestimento.getSaldoDisponivel());
    }    
}
