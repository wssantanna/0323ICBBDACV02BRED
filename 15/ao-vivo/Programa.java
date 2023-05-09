public class Programa {
    public static void main(String[] args) {
        Fisica pessoa = new Fisica("Willian");
        System.out.println(pessoa.saudar());

        Juridica empresa = new Juridica();
        System.out.println(empresa.saudar());

        Cliente hibrido = new Cliente();
        System.out.println(hibrido.saudar());

        Administrador administrador = new Administrador();
        System.out.println(administrador.saudar());
    }    
}
