class Catraca {
    public static void main(String[] args) {
      
      String idade = System.console().readLine("Qual sua idade");
      int idadeMinima = 18;
      Boolean menorIdade = Integer.parseInt(idade) < idadeMinima;
  
      if (menorIdade) {
        System.out.println("É necessário uma autorização.");
      }
  
      // Esta linha de código será executada idependente o resultado da condicional a cima.
      System.out.println("Obrigado por sua preferência.");
    }
  }