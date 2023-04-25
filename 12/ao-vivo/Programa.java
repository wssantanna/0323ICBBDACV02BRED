public class Programa {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();

        aluno.setNome("Willian");
        aluno.setSobrenome("Sant Anna");

        String nomeCompleto = aluno.getNomeCompleto();

        System.out.println(nomeCompleto);
    }
}
