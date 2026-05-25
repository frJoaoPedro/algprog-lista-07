import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] contadores = new int[9];

        System.out.println("Digite as vendas brutas dos vendedores (ou digite um valor negativo para encerrar):");
 
        while (true) {
            // aprendendo ainda a usar emquanto true pra aprender a economizar tempo\
            

            System.out.print("Vendas brutas do vendedor: $");
            double vendasBrutas = scanner.nextDouble();
            if (vendasBrutas < 0) {
                break;
            }

            double salario = 200 + (0.09 * vendasBrutas);

            int indice = (int) (salario / 100) - 2;

            if (indice > 8) {
                indice = 8;
            } else if (indice < 0) {
                indice = 0;
            }

            contadores[indice]++;
        }

        System.out.println("\n--- Resultado da Quantidade de Vendedores por Faixa Salarial ---");
        String[] faixas = {
            "$200 - $299", "$300 - $399", "$400 - $499", "$500 - $599",
            "$600 - $699", "$700 - $799", "$800 - $899", "$900 - $999", "$1000 em diante"
        };

        for (int i = 0; i < 9; i++) {
            System.out.println(faixas[i] + ": " + contadores[i] + " vendedor(es)");
        }

        scanner.close();
    }
}