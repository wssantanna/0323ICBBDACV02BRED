public class Programa {

    public static void main(String[] args) {        
        Cliente cliente = new Cliente();
        Fisica fisica = new Fisica();
        Juridica juridica = new Juridica();
    
        System.out.println(cliente.saudar());
        System.out.println(fisica.saudar());
        System.out.println(juridica.saudar());
    }
}
