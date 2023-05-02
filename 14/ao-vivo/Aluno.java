import java.util.Date;

public class Aluno extends Usuario {

    public Aluno(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    private String[] notas;

    public void setNotas(String[] notas) {
        this.notas = notas;
    }

    public String[] getNotas() {
        return notas;
    }

    public Date getDataInscricao() {
        return super.dataDeInscricao;
    }
}
