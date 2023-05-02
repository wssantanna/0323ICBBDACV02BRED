public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Willian", "Sant Anna");
        System.out.println(aluno.getNome());
        System.out.println(aluno.getSobrenome());
        System.out.println(aluno.getDataInscricao());

        Professor professor = new Professor("Willian", "Sant Anna");
        System.out.println(professor.getNome());
        System.out.println(professor.getSobrenome());
    }    
}
