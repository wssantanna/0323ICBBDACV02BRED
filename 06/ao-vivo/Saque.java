class Saque {
    public static void main(String[] args) {
  
      String valorDoSaque = System.console().readLine("Digite o valor que deseja sacar: ");
      Double saldoEmConta = 0.0;
      Boolean autorizaSaque = Double.parseDouble(valorDoSaque) >= saldoEmConta;
  
      if (autorizaSaque) {
        System.out.println("Estamos realizando a contagem das cédulas. Aguarde um instante.");
      }
      else {
        System.out.println("Saldo insuficiente.");
      }
  
      // Esta linha de código será executada idependente o resultado da condicional a cima.
      System.out.println("Obrigado por sua preferência.");
    }
  }