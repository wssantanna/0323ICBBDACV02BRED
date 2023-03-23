class Somar {

    public static void main(String[] args) {

        // Entrada do nome do usuário...
        String nome; 
        nome = System.console().readLine("Digite seu primeiro nome: ");
        
        // Entrada na idade do usuário...
        String idade;
        idade = System.console().readLine("Digite sua idade: ");
        
        // O ano atual foi defindo pelo sistema, logo não necessitou de uma leitura do console.
        int anoAtual = 2023;

        // Calculo da data de nascimento substraindo de "anoAtual" a "idade" do usuário.
        // Obs.: Precisei converter o valor de idade para um inteiro.
        int dataDeNascimento = anoAtual - Integer.parseInt(idade);

        // Concatenei os textos.
        // Obs.: Observe que o inteiro foi convertido implicitamente para String.
        String mensagem = "Olá" + " " + nome + " " + "você nasceu em" + " " + dataDeNascimento;
        
        // Saída do resultado no terminal.
        System.out.println(mensagem);
    }
}