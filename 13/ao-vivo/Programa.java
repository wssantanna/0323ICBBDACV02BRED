public class Programa {
    public static void main(String[] args) {
        // 1) Criando uma instância
        Aluno aluno = new Aluno();
        // 2) Definindo valores
        aluno.setNome("Viviane");
        aluno.setSobrenome("Panza");
        aluno.setMatricula("12345"); // Só existe na classe Aluno
        // 3) Apresentando valores
        System.out.println(aluno.getNome());
        System.out.println(aluno.getSobrenome());
        System.out.println(aluno.getMatricula()); // Só existe na classe Aluno

        // 1) Criando uma instância
        Professor professor = new Professor();
        // 2) Definindo valores
        professor.setNome("Willian");
        professor.setSobrenome("Sant Anna");
        professor.setSalario(8.500); // Só existe na classe Professor
        // 3) Apresentando valores
        System.out.println(professor.getNome());
        System.out.println(professor.getSobrenome());
        System.out.println(professor.getSalario()); // Só existe na classe Professor
    }    
}
