// 1) Classe = objeto
class Tabuada {

    // 2) Atributo = variáveis
    public int limiteDoMultiplicador = 10;
    
    // 3) Método = função(parametro)
    public String calcular(String valor) {
        
        // 1) Pede o valor para o usuário...
        // String valor = System.console().readLine("Digite o valor que deseja tabuada.");
        String tabuada = "";
        
        // 2) calcula a tabuada...
        for(int multiplicador = 0; multiplicador <= limiteDoMultiplicador; multiplicador++) {
            int resultado = Integer.parseInt(valor) * multiplicador;
            // 3) Apresentar o resultado no terminal
            // System.out.println(valor + "x" + multiplicador + "=" + resultado);
            tabuada += valor + "x" + multiplicador + "=" + resultado + "\n";
        }

        return tabuada;
    }    
}
