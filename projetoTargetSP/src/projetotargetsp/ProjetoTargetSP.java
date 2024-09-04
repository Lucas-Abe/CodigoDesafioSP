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

        /* Exercício 2*/
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
 /*Exercício 4*/
 /*
        int[] dias = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        double[] valores = {22174.1664, 24537.6698, 26139.6134, 0.0, 0.0, 26742.6612, 0.0, 42889.2258, 46251.174, 11191.4722, 0.0, 0.0, 3847.4823, 373.7838, 2659.7563, 48924.2448, 18419.2614, 0.0, 0.0, 35240.1826, 43829.1667, 18235.6852, 4355.0662, 13327.1025, 0.0, 0.0, 25681.8318, 1718.1221, 13220.495, 8414.61};

        double maiorFaturamento = 0;
        double media = 0;
        int diaMesMaior = 0;
        int diaMesMenor = 0;
        int contagem = 0;

        for (int i = 0; i < valores.length; i++) {
            media += valores[i];
        }
        media = media / 21;

        for (int i = 0; i < valores.length; i++) {

            if (maiorFaturamento < valores[i]) {
                maiorFaturamento = valores[i];
                diaMesMaior = i;
            }
        }

        double menorFaturamento = maiorFaturamento;

        for (int i = 0; i < valores.length; i++) {

            if(valores[i] == 0){
                
            }
            else if(menorFaturamento > valores[i]) {
                menorFaturamento = valores[i];
                diaMesMenor = i;
            }
        }

        for (int i = 0; i < valores.length; i++) {
            if (valores[i] > media) {
                contagem++;
            }
        }

        System.out.println(String.format("Media mensal: %.2f", media));
        System.out.println("Numero de dias no mes que o valor de faturamento diario foi acima da media: " + contagem);
        
        System.out.println(String.format("\nO maior faturamento foi feito no dia %d de R$ %.2f", (diaMesMaior + 1), maiorFaturamento));
        System.out.println(String.format("O menor faturamento foi feito no dia %d de R$ %.2f", (diaMesMenor + 1), menorFaturamento));
         */
 /*Exercício 4*/
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
 /*Exercício 5*/
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
