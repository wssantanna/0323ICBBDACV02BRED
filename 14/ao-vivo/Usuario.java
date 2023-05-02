import java.util.Date;

public class Usuario {

    private String nome;
    private String sobrenome;
    protected Date dataDeInscricao;

    public Usuario(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataDeInscricao = new Date();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }
}
