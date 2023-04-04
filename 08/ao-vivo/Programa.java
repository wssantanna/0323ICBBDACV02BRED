public class Programa {
    public static void main(String[] args) {

        int[] numeros = new int[2];

        // Capturar valores numéricos
        for(int indice = 0; indice < numeros.length; indice++){
            String numero = System.console().readLine("Digite o valor do" + " " + (indice+1) + " " + "valor: ");

            numeros[indice] = Integer.parseInt(numero);
        }

        // Apresentar valores numéricos
        for(int indice = 0; indice < numeros.length; indice++) {
            System.out.println("O valor" + " " + (indice+1) + " " + "é:" + " " + numeros[indice]);
        }
    }
}
