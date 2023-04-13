public class Tabuada {
    public String calcular(String valor) {
        
        String tabuada = "";

        for(int multiplicador = 0; multiplicador <= 10; multiplicador++) {
            int resultado = Integer.parseInt(valor) * multiplicador;
            tabuada += valor + "x" + multiplicador + "=" + resultado + "\n";
        }

        return tabuada;
    }
}
