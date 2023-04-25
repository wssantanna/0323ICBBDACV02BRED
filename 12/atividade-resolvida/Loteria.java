public class Loteria {

    int[] numerosPremiados = {6, 11, 27, 32, 36, 55};

    public int ApurarNumerosDoBilhete() {
        int numeroDeAcertos = 0;
        int[] bilhete = new int[6];
        
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

        return numeroDeAcertos;
    } 

    public String ApresentarResultadoParaUsuario(int numeroDeAcertos) {
        
        String mensagem;

        switch(numeroDeAcertos) {
            case 6:
                mensagem = "Parabéns, você ganhou na sena!"; 
            break;
            case 5:
                mensagem ="Parabéns, você ganhou na quina!";
            break;
            case 4:
                mensagem = "Parabéns, você ganhou na quadra!";
            break;
            default:
                mensagem ="Infelizmente não foi dessa vez.";
            break;
        }

        return mensagem;
    }
}
