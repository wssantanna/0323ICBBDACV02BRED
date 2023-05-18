package application;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

import entities.Fisica;
import entities.Juridica;
import entities.Contribuinte;

public class Program {
    
    public static void main(String[] args) {
        
        List<Contribuinte> contribuintes = new ArrayList<Contribuinte>();

        Scanner e = new Scanner(System.in);
        
        System.out.print("Insira o número de contribuíntes: ");
        int numeroDeContribuintes = e.nextInt();

        for(int indiceDoContribuinte = 0; indiceDoContribuinte < numeroDeContribuintes; indiceDoContribuinte++) {
            
            // 1) Entrada de dados
            int ordemDoContribuinte = indiceDoContribuinte + 1;
            System.out.println("Contribuinte #"+ ordemDoContribuinte + ":");
            //
            System.out.print("Pessoa física ou jurídica (f/j): ");
            char tipoContribuinte = e.next().charAt(0);
            //
            System.out.print("Nome completo: ");
            String nome = e.next();
            //
            System.out.print("Rendimento anual: ");
            double rendimentoAnual = e.nextDouble();
            
            // 2) Regras de negócio
            if(tipoContribuinte == 'f') {
                System.out.print("Gastos com saúde: ");
                double gastosComSaude = e.nextDouble();
                // 
                contribuintes.add(new Fisica(nome, rendimentoAnual, gastosComSaude));
            }
            else {
                System.out.print("Número de funcionários: ");
                int numeroDeFuncionarios = e.nextInt();
                contribuintes.add(new Juridica(nome, rendimentoAnual, numeroDeFuncionarios));
            }
        }
        
        e.close();

        // 3) Apresentação dos resultados
        System.out.println("---------------------------------------");
        System.out.println("IMPOSTOS PAGOS:");
        // 
        for(Contribuinte contribuinte : contribuintes) {
            System.out.println(contribuinte.getNome() + ": R$ " + String.format("%.2f", contribuinte.getTaxa()));
        }

        System.out.println("---------------------------------------");
        double valorTotal = 0.0;
        // 
        for(Contribuinte contribuinte : contribuintes) {
            valorTotal += contribuinte.getImposto();
        }
        System.out.println("Total imposto: R$" + " " + String.format("%.2f", valorTotal));
    }
}