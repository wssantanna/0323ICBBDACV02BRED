public class SaqueOuEmprestimo {
    public static void main(String[] args) {

        String valorDoSaque = System.console().readLine("Digite o valor que deseja sacar: ");
        Double saldoEmDebito = 0.0;
        Double saldoEmCredito = 149.99;
        Boolean autorizaSaqueComDebito = Double.parseDouble(valorDoSaque) >= saldoEmDebito;
        Boolean autorizaSaqueComCredito = Double.parseDouble(valorDoSaque) >= saldoEmCredito;
    
        if (autorizaSaqueComDebito) {
          System.out.println("Saque com débido: Estamos realizando a contagem das cédulas. Aguarde um instante.");
        }
        else if(autorizaSaqueComCredito) {
          System.out.println("Saque com crédito: Estamos realizando a contagem das cédulas. Aguarde um instante.");
        }
        else {
          System.out.println("Saldo insuficiente.");
        }
    
        // Esta linha de código será executada idependente o resultado da condicional a cima.
        System.out.println("Obrigado por sua preferência.");
      }
}
