package projetotargetsp;

import java.util.Scanner;

/**
 *
 * @author lucas
 */
public class ProjetoTargetSP {

    public static int fibonacci(int numero) {
        if (numero <= 1) {
            return numero;
        } else {
            return fibonacci(numero - 1) + fibonacci(numero - 2);
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Exercício 1*/
 /*
        System.out.println("Insire um numero:");
        int numeroEscolhido = input.nextInt();
        int check = 1;

        if (numeroEscolhido < 0) {
            System.out.println("Entrada inválida. Por favor, tente novamente.");
            System.exit(-1);
        } 
        else {
            for (int i = 0; ; i++) {
                int contagem = fibonacci(i);

                if (contagem == numeroEscolhido) {
                    check = 0;
                    break;
                } 
                else if (contagem > numeroEscolhido) {
                    check = -1;
                    break;
                }

            }

        }

        if (check == 0) {
            System.out.println("O numero " + numeroEscolhido + " esta presente na sequencia de Fibonacci!");
        } 
        else {
            System.out.println("O numero " + numeroEscolhido + " nao se encontra na sequencia de Fibonnaci.");
        }
         */
 /*Exercício 2*/
 /*
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double total = sp + rj + mg + es + outros;
        System.out.println("Valor total: R$" + total);

        double porcentagemSP = (sp / total) * 100;
        double porcentagemRJ = (rj / total) * 100;
        double porcentagemMG = (mg / total) * 100;
        double porcentagemES = (es / total) * 100;
        double porcentagemOutros = (outros / total) * 100;

        System.out.println("Total de porcentagens:\n");

        System.out.println(String.format("Porcentagem de SP: %,.2f%%", porcentagemSP));
        System.out.println(String.format("Porcentagem de RJ: %,.2f%%", porcentagemRJ));
        System.out.println(String.format("Porcentagem de MG: %,.2f%%", porcentagemMG));
        System.out.println(String.format("Porcentagem de ES: %,.2f%%", porcentagemES));
        System.out.println(String.format("Porcentagem de Outros: %,.2f%%", porcentagemOutros));
         */
 /*Exercício 3*/
 /*
         String textoEntrada = input.nextLine();
         System.out.println("Palavra original: " + textoEntrada);
         String textoSaida = "";
         char letras;
         
         for(int i = 0; i < textoEntrada.length(); i++){
             letras = textoEntrada.charAt(i);
             textoSaida = letras + textoSaida;
         }

         System.out.println("Texto final: " + textoSaida);
         */
    }

}
