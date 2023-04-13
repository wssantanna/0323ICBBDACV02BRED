public class Boletim {

  public static void main(String[] args) {
    double[] notas = new double[4];
    double somaDasNotas = 0;
    double media = 0;

    // Cadastrar as notas
    for (int bimestre = 0; bimestre < 4; bimestre++) {
      String nota = System.console().readLine("Digite a nota do bimestre" + (bimestre + 1) + ": ");
      notas[bimestre] = Double.parseDouble(nota);
    }

    // Somo as notas de todos os bimestres
    for(int bimestre = 0; bimestre < 4; bimestre++) {
      somaDasNotas += notas[bimestre];
    }

    // Calculo a média
    media = somaDasNotas / 4;

    System.out.println("Sua média é: " + media);
  }
}