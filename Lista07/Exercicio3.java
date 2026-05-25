import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();

        System.out.println("Digite as notas (ou -1 para encerrar):");
        while (true) {
            System.out.print("Nota: ");
            double nota = scanner.nextDouble();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
        }

        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota foi registrada. Programa encerrado.");
        } else {
            int qtdValores = notas.size();
            System.out.println("\na) Quantidade de valores lidos: " + qtdValores);

            System.out.print("b) Valores informados: ");
            for (double nota : notas) {
                System.out.print(nota + " ");
            }
            System.out.println();

            System.out.println("c) Valores na ordem inversa:");
            // Criando uma cópia invertida para não alterar a lista original
            ArrayList<Double> notasInversas = new ArrayList<>(notas);
            Collections.reverse(notasInversas);
            for (double nota : notasInversas) {
                System.out.println(nota);
            }

            double somaValores = 0;
            for (double nota : notas) {
                somaValores += nota;
            }
            System.out.println("d) Soma dos valores: " + somaValores);

            double mediaValores = somaValores / qtdValores;
            System.out.printf("e) Média dos valores: %.2f\n", mediaValores);

            int acimaDaMedia = 0;
            int abaixoDeSete = 0;
            for (double nota : notas) {
                if (nota > mediaValores) {
                    acimaDaMedia++;
                }
                if (nota < 7) {
                    abaixoDeSete++;
                }
            }

            System.out.println("f) Quantidade de valores acima da média: " + acimaDaMedia);
            System.out.println("g) Quantidade de valores abaixo de sete: " + abaixoDeSete);

            System.out.println("\nObrigado por utilizar o sistema de notas UNA. Programa finalizado com sucesso!");
        }
        
        scanner.close();
    }
}