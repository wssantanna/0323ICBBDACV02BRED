public class Aluno {
    
    private String nome;
    private String sobrenome;
    
    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
}
