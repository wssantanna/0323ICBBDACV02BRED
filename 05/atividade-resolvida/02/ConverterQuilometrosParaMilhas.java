public class ConverterQuilometrosParaMilhas {
    
    public static void main(String[] args) {

        // Entrada dos valores de quilometro...
        String quilometrosPecorridos;
        quilometrosPecorridos = System.console().readLine("Digite o valor de quilometros pecorridos: ");

        // Calculo de conversão de km para milhas...
        double milhasPecorridas;
        milhasPecorridas = Double.parseDouble(quilometrosPecorridos) * 0.62137;
    
        // Mensagem e condicional para apresentação da mensagem...
        String mensagemDeResultado;
        mensagemDeResultado = 
            milhasPecorridas > 100000 
            ? "Seu veículo pecorreu" + " " + milhasPecorridas + " " + "milhas." 
            : "Seu veículo pecorreu" + " " + milhasPecorridas + "milhas e seria interessante marcar uma revisão.";

        // Saída do resultado no terminal.
        System.out.println(mensagemDeResultado);
    }
}
