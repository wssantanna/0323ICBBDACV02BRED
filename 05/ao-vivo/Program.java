class Program {

    public static void main(String[] args) {
        
        // Entrada de valores
        String mensagem = System.console().readLine("Digite uma mensagem: ");
        String nome = System.console().readLine("Digite seu nome: ");
        String resposta = mensagem + " " + nome;

        // Saída de valores
        System.out.println(resposta);
    }
}