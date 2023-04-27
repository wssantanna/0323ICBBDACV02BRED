public class Programa {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.depositar(1000);
        minhaConta.sacar(200);

        System.out.println(minhaConta.apresentarSaldoAtual());
    }    
}
