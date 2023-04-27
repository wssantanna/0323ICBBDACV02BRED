// A classe Professor herda recursos da classe Usuário
public class Professor extends Usuario {
    private double salario; 

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
