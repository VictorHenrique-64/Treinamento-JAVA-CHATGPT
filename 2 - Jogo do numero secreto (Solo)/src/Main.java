import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> tentativas = new ArrayList<Integer>();
        char repetir;

        System.out.println("\n\\~\\~\\~\\~\\ JOGO DO NÚMERO SECRETO (SOLO) /~/~/~/~/\n");

        do {
            System.out.print("Selecione o limite do jogo (o limite deve ser no minimo 50): ");
            int limite = scan.nextInt();
            double random = Math.random();
            int numeroSecreto = (int) (random * limite + 1);
            int resposta = 0;
            System.out.println(numeroSecreto);
            System.out.print("Escolha um número de 1 até " + limite + ":");
            while (resposta != numeroSecreto) {
                resposta = scan.nextInt();
                if (resposta < numeroSecreto) {
                    System.out.print("O número secreto é menor - ");
                    tentativas.add(resposta);
                } else if (resposta > numeroSecreto) {
                    System.out.print("O número secreto é maior - ");
                    tentativas.add(resposta);
                } else if (resposta <= 0 || resposta > limite){
                    System.out.println("Você deve selecionar somente os número de 1 à " + limite + ". Tente novamente\n");
                    System.out.print("Escolha um número de 1 até " + limite + " - ");
                } else {
                    System.out.println("\nParabéns, você acertou o número secreto!");
                    System.out.println("Número secreto: " + numeroSecreto);
                    System.out.println("Quantidade de tentativas: " + tentativas.size());
                    System.out.print("Suas tentativas: ");
                    for (Integer tentativa : tentativas) {
                        System.out.print(tentativas);
                    }
                }
            }
            System.out.print("Gostaria de jogar novamente? (s/n): ");
            repetir = scan.next().charAt(0);

            while (repetir != 's' && repetir != 'n' && repetir != 'S' && repetir != 'N') {
                System.out.println("Você deve selecionar 's' (Sim), ou 'n' (Não). Tente novamente.");
                System.out.print("Gostaria de jogar novamente? (s/n): ");
                repetir = scan.next().charAt(0);
            }
        } while (repetir == 's' || repetir == 'S');

        scan.close();
    }
}

//            dificuldades: 1-facil (limite: 50 - chances: infinita), 2-médio (limite: 100 - chances: 10)
//            3-dificil (limite: 250 - chances: 10), 4-muito dificil (limite: 250 - chances: 5), 5-personalizado.
//            resposta: 121212 - ver numero secreto (cheat)