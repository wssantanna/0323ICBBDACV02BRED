public class Programa {
    public static void main(String[] args) {
        // Crie uma instância para classe Loteria e apure o resultado...
        Loteria sorteio = new Loteria();
        int numeroDeAcertos = sorteio.ApurarNumerosDoBilhete();
        String mensagem = sorteio.ApresentarResultadoParaUsuario(numeroDeAcertos);

        System.out.println(mensagem);
    }
}
