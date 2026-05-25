import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] perguntas = {
            "Telefonou para a vítima? ",
            "Esteve no local do crime? ",
            "Mora perto da vítima? ",
            "Devia para a vítima? ",
            "Já trabalhou com a vítima? "
        };

        int respostasPositivas = 0;

        System.out.println("Responda com 'sim' ou 'nao' para as perguntas abaixo:");
        for (String pergunta : perguntas) {
            System.out.print(pergunta);
            String resposta = scanner.next().trim().toLowerCase();
            if (resposta.equals("sim")) {
                respostasPositivas++;
            }
        }

        String classificacao;
        if (respostasPositivas == 2) {
            classificacao = "Suspeita";
        } else if (respostasPositivas >= 3 && respostasPositivas <= 4) {
            classificacao = "Cúmplice";
        } else if (respostasPositivas == 5) {
            classificacao = "Assassino";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("\nClassificação do envolvimento: " + classificacao);
        scanner.close();
    }
}