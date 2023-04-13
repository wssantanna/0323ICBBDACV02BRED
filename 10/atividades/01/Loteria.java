public class Loteria {
    public static void main(String[] args) {

        // Vai para o escopo global da classe
        int[] numerosPremiados = {6, 11, 27, 32, 36, 55};
        
        // apurarNumerosDoBilhete()
        int[] bilhete = new int[6];
        int numeroDeAcertos = 0;

        for(int i = 0; i < 6; i++) {
            // Program.java : Capture os seis números do bilhete do usuário
            String numero = System.console().readLine("Digite seu" + " " + " número da sorte: ");
            bilhete[i] = Integer.parseInt(numero);
            
            for(int u = 0; u < 6; u++) {
                if(bilhete[i] == numerosPremiados[u]) {
                    numeroDeAcertos++;
                } 
            }
        }

        // apresentarResultadoParaUsuario()
        switch(numeroDeAcertos) {
            case 6:
                System.out.println("Parabéns, você ganhou na sena!"); 
            break;
            case 5:
                System.out.println("Parabéns, você ganhou na quina!");
            break;
            case 4:
                System.out.println("Parabéns, você ganhou na quadra!");
            break;
            default:
                System.out.println("Infelizmente não foi dessa vez.");
            break;
        }
    }
}
