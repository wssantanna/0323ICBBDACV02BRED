public class Professor extends Usuario {
    
    public Professor(String nome, String sobrenome) {
        super(nome, sobrenome);
    }

    private double horaAula;
    
    public double getHoraAula() {
        return horaAula;
    }

    public void setHoraAula(double horaAula) {
        this.horaAula = horaAula;
    }
}
