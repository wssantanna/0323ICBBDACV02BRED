import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        try {
            // Importação dos arquivos...
            File planilhaEmCsv = new File("cultivos.csv");
            // Leitura de todos os dados da planilha...
            Scanner planilhaEscaneada = new Scanner(planilhaEmCsv);
            // Enquanto tem dados para serem lidos...
            //boolean temDadosParaSeremLidos = planilhaEscaneada.hasNextLine();
            while(planilhaEscaneada.hasNextLine()) {
                // Leitura da linha atual
                String linhaAtual = planilhaEscaneada.nextLine();
                // Leitura das colunas da linha atual
                // Nota: Para outros formatos de arquivos, 
                // será possível criar regras mais completas utilizando RegEx
                String[] colunas = linhaAtual.split(",");
                // Leitura dos dados de cada coluna
                for(String colunaAtual : colunas) {
                    // Impressão no console do valor de cada coluna
                    System.out.print(colunaAtual + "\t");
                }
                // Quebra de linha
                System.out.println();
            }
            // Fim da leitura
            // Nota: Observei que seria interessante paginar a leitura,
            // pois normalmente essas planilhas são fonte de muito dados.
            planilhaEscaneada.close();
        }
        catch(FileNotFoundException mensagemErro) {
            // Captura de excessões
            mensagemErro.printStackTrace();
        }
    }
}
