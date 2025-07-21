import java.util.Scanner;
public class Main {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n ---- BEM VINDO AO SISTEMA DE PAR/IMPAR ---- ");
        char repetir;
        char[] sim = new char[2];
        sim[0] = 's';
        sim[1] = 'S';
        do {
            System.out.print("\nAté qual número gostaria de contar? ");
            int numero = scan.nextInt();
            while (numero <= 0) {
                System.out.println("O número deve ser maior que 0, tente novamente.");
                System.out.print("Até qual número gostaria de contar? ");
                numero = scan.nextInt();
            }
            System.out.println("\n");
            int par = 0;
            int impar = 0;
            int cont = 1;
            while (cont <= numero) {
                if (cont % 2 == 0) {
                    System.out.println(cont + " - Par");
                    par++;
                } else {
                    System.out.println(cont + " - Impar");
                    impar++;
                }
                cont++;
            }
            System.out.println("\nTotal de Pares: " + par);
            System.out.println("Total de Ímpares: " + impar);
            System.out.print("\nDeseja repetir o programa? (s/n):  ");
            repetir = scan.next().charAt(0);
            while (repetir != 's' && repetir != 'S' && repetir != 'n' && repetir != 'N') {
                System.out.println("Você deve responder com 's' (Sim) ou 'n' (Não). Tente Novamente.");
                System.out.print("Deseja repetir o programa? (s/n): ");
                repetir = scan.next().charAt(0);
            }
        } while (repetir == sim[0] || repetir == sim[1]);

        scan.close();
    }
}