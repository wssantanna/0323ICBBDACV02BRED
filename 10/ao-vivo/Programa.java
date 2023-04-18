class Programa {
    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();

        // Algoritmo 1) Capturo os valores do usuário 
        String valor = System.console().readLine("Digite o valor que deseja tabuada.");

        // Algoritmo 2) Calculo a tabuada 
        String resultado = tabuada.calcular(valor);

        // Algoritmo 3) Apresento o resultado no terminal 
        System.out.println(resultado);
    }
}