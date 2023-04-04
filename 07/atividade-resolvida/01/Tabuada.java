public class Tabuada {
    public static void main(String[] args) {
        
        String valor = System.console().readLine("Digite o valor que deseja tabuada.");
        
        for(int multiplicador = 0; multiplicador <= 10; multiplicador++) {
            int resultado = Integer.parseInt(valor) * multiplicador;
            System.out.println(valor + "x" + multiplicador + "=" + resultado);
        }
    }    
}
