public class Programa {
    public static void main(String[] args) {
        
        double valorTotal = 1000.0;
        double valorEntrada = 300.0;
        int numeroDeParcelas = 2;

        try {
            Financiamento f = new Financiamento(valorTotal, valorEntrada, numeroDeParcelas);
            System.out.println(f.getValorDasPrestacoes());
        }
        catch(RuntimeException excessao) {
            System.out.println(excessao.getMessage());
        }
    }
}
