public class Fisica extends Cliente {   
    
    private String nome;

    public Fisica(String nome) {
        this.nome = nome;
    }
    
    // Sobrescrevendo a função existente
    public String saudar() {
        return "Olá" + " " + nome;
    }
}
