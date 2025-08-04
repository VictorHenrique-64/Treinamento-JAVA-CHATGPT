import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        int resposta;
        double primeiroNum;
        double segundoNum;

        System.out.println("\n \\~\\~\\~\\~\\ CALCULADORA /~/~/~/~/\n");
        do {
            System.out.println("[1] Adição");
            System.out.println("[2] Subtração");
            System.out.println("[3] Divisão");
            System.out.println("[4] Multiplicação");
            System.out.println("[5] Sair da Calculadora");
            System.out.print("Selecione uma operação: ");
                resposta = scan.nextInt();

            switch (resposta) {
                case 1 :
                    System.out.print("\nSelecione o primeiro número: ");
                    primeiroNum = scan.nextDouble();
                    System.out.print("\nSelecione o segundo número: ");
                    segundoNum = scan.nextDouble();
                    System.out.println(primeiroNum + " + " + segundoNum + " = " + (primeiroNum + segundoNum) + "\n");
                    break;

                case 2 :
                    System.out.print("\nSelecione o primeiro número: ");
                    primeiroNum = scan.nextDouble();
                    System.out.print("\nSelecione o segundo número: ");
                    segundoNum = scan.nextDouble();
                    System.out.println(primeiroNum + " - " + segundoNum + " = " + (primeiroNum - segundoNum) + "\n");
                    break;

                case 3 :
                    System.out.print("\nSelecione o primeiro número: ");
                    primeiroNum = scan.nextDouble();
                    System.out.print("\nSelecione o segundo número: ");
                    segundoNum = scan.nextDouble();
                    System.out.println(primeiroNum + " ÷ " + segundoNum + " = " + (primeiroNum / segundoNum) + "\n");
                    break;

                case 4 :
                    System.out.print("\nSelecione o primeiro número: ");
                    primeiroNum = scan.nextDouble();
                    System.out.print("Selecione o segundo número: ");
                    segundoNum = scan.nextDouble();
                    System.out.println(primeiroNum + " x " + segundoNum + " = " + (primeiroNum * segundoNum) + "\n");
                    break;

                case 5 :
                    break;
            }
        } while (resposta != 5);

        System.out.println("\nAté a próxima!");
        scan.close();
    }
}