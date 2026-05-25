import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] eloquence) {
        Scanner scanner = new Scanner(System.in);
        
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        ArrayList<Double> temperaturas = new ArrayList<>();
        double soma = 0;

        System.out.println("Digite a temperatura média de cada mês:");
        for (int i = 0; i < 12; i++) {
            System.out.print((i + 1) + " - " + meses[i] + ": ");
            double temp = scanner.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }

        double mediaAnual = soma / 12;
        System.out.printf("\n--- Média Anual: %.2f°C ---\n", mediaAnual);
        System.out.println("Meses com temperatura acima da média anual:");

        for (int i = 0; i < 12; i++) {
            if (temperaturas.get(i) > mediaAnual) {
                System.out.printf("%d - %s: %.1f°C\n", (i + 1), meses[i], temperaturas.get(i));
            }
        }
        
        scanner.close();
    }
}