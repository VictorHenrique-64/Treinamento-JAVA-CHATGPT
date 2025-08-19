import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> tentativas = new ArrayList<Integer>();
        char repetir = 0;
        boolean cheat = false;
        int dificuldade = 0;
        int resposta = 0;

        System.out.println("\n\\~\\~\\~\\~\\ JOGO DO NÚMERO SECRETO /~/~/~/~/");

        do {
            if (cheat) {
                System.out.println("\n *** CHEAT ATIVADO (64) *** \n");
            } else {
                System.out.println(" ");
            }
            System.out.println("[1] Fácil (Limite: 100 - Chances: Infinita)");
            System.out.println("[2] Médio (Limite: 100 - Chances: 10");
            System.out.println("[3] Difícil (Limite: 250 - Chances: 10");
            System.out.println("[4] Muito Difícil (Limite: 250 - Chances: 5");
            System.out.println("[5] Personalizado");
            System.out.print("Selecione a dificuldade: ");
            if (scan.hasNextInt()) {
                dificuldade = scan.nextInt();

                switch (dificuldade) {
                    
                    case 5:
                        int limitePersonalizado = 0;
                        int chancesPersonalizado = -1;
                        while (limitePersonalizado < 50) {
                            System.out.print("\nSelecione o limite do jogo (o limite deve ser no minimo 50): ");
                            if (scan.hasNextInt()) {
                                limitePersonalizado = scan.nextInt();
                                if (limitePersonalizado < 50) {
                                    System.out.println("\n *** O LIMITE DEVE SER NO MINIMO 50 ***");
                                }
                                while (chancesPersonalizado < 0 && limitePersonalizado >= 50) {
                                    System.out.print("Selecione quantas chances irá ter no jogo (Chances infinitas = 0): ");
                                    if (scan.hasNextInt()) {
                                        chancesPersonalizado = scan.nextInt();
                                        double random = Math.random();
                                        int numeroSecreto = (int) (random * limitePersonalizado + 1);
                                        resposta = 0;
                                        if (cheat) {
                                            System.out.println("\n *** DEV MODE: " + numeroSecreto + " *** \n");
                                        }
                                        while (resposta != numeroSecreto && chancesPersonalizado == 0) {
                                            System.out.println("\nChances restantes: INFINITO.");
                                            System.out.print("Escolha um número de 1 até " + limitePersonalizado + ": ");
                                            if (scan.hasNextInt()) {
                                                resposta = scan.nextInt();
                                                if (resposta < numeroSecreto) {
                                                    System.out.println("\nO número secreto é maior");
                                                    tentativas.add(resposta);
                                                } else if (resposta > numeroSecreto) {
                                                    System.out.println("\nO número secreto é menor");
                                                    tentativas.add(resposta);
                                                } else if (resposta <= 0 || resposta > limitePersonalizado) {
                                                    System.out.println(" *** VOCÊ DEVE SELECIONAR SOMENTE OS NÚMEROS DE 1 À " + limitePersonalizado + ". TENTE NOVAMENTE ***\n");
                                                    System.out.print("Escolha um número de 1 até " + limitePersonalizado + ": ");
                                                } else {
                                                    System.out.println("\nParabéns, você acertou o número secreto!");
                                                    System.out.println("Número secreto: " + numeroSecreto);
                                                    System.out.println("Quantidade de tentativas: " + (tentativas.size() + 1));
                                                    System.out.print("Suas tentativas: ");
                                                    for (int i = 0; i < tentativas.size(); i++) {
                                                        System.out.print(tentativas.get(i) + ", ");
                                                    }
                                                    System.out.print(resposta + ".\n");
                                                }
                                            } else {
                                                System.out.println("\n *** VOCÊ DEVE SELECIONAR SOMENTE OS NÚMEROS DE 1 À " + limitePersonalizado + ". TENTE NOVAMENTE ***");
                                                scan.next();
                                            }
                                        }
                                        while (resposta != numeroSecreto && chancesPersonalizado > 0) {
                                            System.out.println("\nChances restantes: " + chancesPersonalizado + ".");
                                            System.out.print("Escolha um número de 1 até " + limitePersonalizado + ": ");
                                            if (scan.hasNextInt()) {
                                                resposta = scan.nextInt();
                                                if (resposta <= 0 || resposta > limitePersonalizado) {
                                                    System.out.println("\n *** VOCÊ DEVE SELECIONAR SOMENTE OS NÚMEROS DE 1 À " + limitePersonalizado + ". TENTE NOVAMENTE ***");
                                                } else if (resposta < numeroSecreto) {
                                                    System.out.println("\nO número secreto é maior");
                                                    tentativas.add(resposta);
                                                    chancesPersonalizado--;
                                                } else if (resposta > numeroSecreto) {
                                                    System.out.println("\nO número secreto é menor");
                                                    tentativas.add(resposta);
                                                    chancesPersonalizado--;
                                                } else {
                                                    System.out.println("\nParabéns, você acertou o número secreto!");
                                                    System.out.println("Número secreto: " + numeroSecreto);
                                                    System.out.println("Quantidade de tentativas: " + (tentativas.size() + 1));
                                                    System.out.print("Suas tentativas: ");
                                                    for (int i = 0; i < tentativas.size(); i++) {
                                                        System.out.print(tentativas.get(i) + ", ");
                                                    }
                                                    System.out.println(resposta);
                                                    tentativas.clear();
                                                }
                                                if (chancesPersonalizado == 0) {
                                                    System.out.println("\nGAME OVER");
                                                    System.out.println("Número secreto: " + numeroSecreto);
                                                    System.out.println("Quantidade de tentativas: " + tentativas.size());
                                                    System.out.print("Suas tentativas: ");
                                                    for (int i = 0; i < (tentativas.size() - 1); i++) {
                                                        System.out.print(tentativas.get(i) + ", ");
                                                    }
                                                    System.out.println(resposta + ".");
                                                    tentativas.clear();
                                                }
                                            } else {
                                                System.out.println("\n *** VOCÊ DEVE SELECIONAR SOMENTE OS NÚMEROS DE 1 À " + limitePersonalizado + ". TENTE NOVAMENTE ***");
                                                scan.next();
                                            }
                                        }
                                    } else {
                                        System.out.println("\n *** A RESPOSTA DEVE SER UM NÚMERO. TENTE NOVAMENTE ***");
                                        scan.next();
                                    }
                                }
                            } else {
                                System.out.println("\n *** A RESPOSTA DEVE SER UM NÚMERO. TENTE NOVAMENTE ***");
                                scan.next();
                            }
                        }
                        break;

                    case 64: //O cheat mostra o numero secreto durante o jogo
                        if (cheat) {
                            cheat = false;
                        } else if (!cheat) {
                            cheat = true;
                        }
                }
                if (dificuldade != 64) {
                    tentativas.clear();
                    System.out.print("Gostaria de jogar novamente? (s/n): ");
                    repetir = scan.next().charAt(0);
                    while (repetir != 's' && repetir != 'n' && repetir != 'S' && repetir != 'N') {
                        System.out.println("Você deve selecionar 's' (Sim), ou 'n' (Não). Tente novamente.");
                        System.out.print("Gostaria de jogar novamente? (s/n): ");
                        repetir = scan.next().charAt(0);
                    }
                }
            } else {
                System.out.println("\n *** A RESPOSTA DEVE SER UM NÚMERO. SELECIONE UMA DAS OPÇÕES APRESENTADAS ***");
                scan.next();
                repetir = 's';
            }
        } while (repetir == 's' || repetir == 'S' || dificuldade == 64);

        scan.close();
    }
}