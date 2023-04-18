public class Programa {
    
    public static void main(String[] args) {
        // 1) ENTRADA: Capturo os dados
        String nome = System.console().readLine("Digite seu nome: ");
        String saudacao = System.console().readLine("Digite a saudação: ");

        // 2) PROCESSAMENTO: Algoritmo para montar a mensagem
        // Retorno Nome            (Parametros de entrada)
        // String  SaudarUsuario   (String saudacao, String nome)
        // String  Saudar          (String saudacao, String nome)
        // String  RequererSaudacao(String saudacao, String nome)
        //String mensagem = saudacao + " " + nome + "."; // "Olá Willian."
        Usuario usuario = new Usuario();
        String mensagem = usuario.Saudar(nome, saudacao);

        // 3) SAIDA: Apresentando a mensagem no terminal
        System.out.println(mensagem);
    }
}
