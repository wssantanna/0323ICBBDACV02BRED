public class ValidarToken {
    public static void main(String[] args) {
        
        String tokenCadastradoNoSistema = "Q0318";
        String tokenEnviadoPeloUsuario;

        do {
           tokenEnviadoPeloUsuario = System.console().readLine("Digite o token válido: ");
        } 
        while(!tokenEnviadoPeloUsuario.equals(tokenCadastradoNoSistema));
        
        System.out.println("Seja bem vindo ao sistema!");
    }    
}
