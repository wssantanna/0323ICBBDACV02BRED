public class JogoDaVelha {
    public static void main(String[] args) {
        //
        char[][] tabuleiro = new char[3][3];

        // 
        for(int linha = 0; linha < 3; linha++) {
            // 
            for(int coluna = 0; coluna < 3; coluna++) {
                tabuleiro[linha][coluna] = '-';
            }
        }

        // Apresento a matriz em formato de tabuleiro...
        System.out.println(tabuleiro[0][0] + " | " + tabuleiro[0][1] + " | " +tabuleiro[0][2]);
        System.out.println("----------");
        System.out.println(tabuleiro[1][0] + " | " + tabuleiro[1][1] + " | " + tabuleiro[1][2]);
        System.out.println("----------");
        System.out.println(tabuleiro[2][0] + " | " + tabuleiro[2][1] + " | " + tabuleiro[2][2]);
    }
}
