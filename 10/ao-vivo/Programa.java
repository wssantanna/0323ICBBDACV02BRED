public class Programa {
    public static void main(String[] args) {
        Tabuada tabuada = new Tabuada();
        String valor = System.console().readLine("Digite o valor que deseja tabuada: ");
        String resultado = tabuada.calcular(valor);

        System.out.println(resultado);
    }
}
