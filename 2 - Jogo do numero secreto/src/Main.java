import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> tentativas = new ArrayList<Integer>();
        char repetir;

        System.out.println("\n\\~\\~\\~\\~\\ JOGO DO NÚMERO SECRETO /~/~/~/~/\n");

        do {
            System.out.println("[1] Fácil (Limite: 100 - Chances: Infinita)");
            System.out.println("[2] Médio (Limite: 100 - Chances: 10");
            System.out.println("[3] Difícil (Limite: 250 - Chances: 10");
            System.out.println("[4] Muito Difícil (Limite: 250 - Chances: 5");
            System.out.println("[5] Personalizado");
            System.out.print("Selecione a dificuldade: ");
            int dificuldade = scan.nextInt();

            switch (dificuldade) {


                case 5:
                    System.out.print("\nSelecione o limite do jogo (o limite deve ser no minimo 50): ");
                    int limitePersonalizado = scan.nextInt();
                    System.out.print("Selecione quantas chances irá ter no jogo (Chances infinitas = 0): ");
                    int chancesPersonalizado = scan.nextInt();

                    double random = Math.random();
                    int numeroSecreto = (int) (random * limitePersonalizado + 1);
                    int resposta = 0;
                    System.out.println(" *** DEV MODE:" + numeroSecreto + " *** ");

                    while (resposta != numeroSecreto && chancesPersonalizado != 0) {
                        System.out.println("Chances restantes: " + chancesPersonalizado + ".");
                        System.out.print("Escolha um número de 1 até " + limitePersonalizado + ":");
                        resposta = scan.nextInt();
                        if (resposta < numeroSecreto) {
                            System.out.println("O número secreto é maior");
                            tentativas.add(resposta);
                            chancesPersonalizado--;
                        } else if (resposta > numeroSecreto) {
                            System.out.println("O número secreto é menor");
                            tentativas.add(resposta);
                            chancesPersonalizado--;
                        } else if (resposta <= 0 || resposta > limitePersonalizado) {
                            System.out.println("Você deve selecionar somente os número de 1 à " + limitePersonalizado + ". Tente novamente\n");
                            System.out.print("Escolha um número de 1 até " + limitePersonalizado + " - ");
                        } else {
                            System.out.println("\nParabéns, você acertou o número secreto!");
                            System.out.println("Número secreto: " + numeroSecreto);
                            System.out.println("Quantidade de tentativas: " + tentativas.size());
                            System.out.println("Suas tentativas: ");
                            for (Integer tentativa : tentativas) {
                                System.out.print(tentativas);
                            }
                        }
                    }
                    if (chancesPersonalizado == 0) {
                        System.out.println("GAME OVER");
                    }
                    break;
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

//            dificuldades: 1-facil (limite: 100 - chances: infinita), 2-médio (limite: 100 - chances: 10)
//            3-dificil (limite: 250 - chances: 10), 4-muito dificil (limite: 250 - chances: 5), 5-personalizado.
//            resposta: 121212 - ver numero secreto - dev mode (cheat)