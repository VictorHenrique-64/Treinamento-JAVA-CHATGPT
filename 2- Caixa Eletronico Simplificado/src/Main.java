import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        char resposta;
        System.out.println("\n~\\~\\~\\~ CAIXA ELETRÔNICO ~/~/~/~");
        do {
            System.out.print("\nQuanto deseja sacar (Somente valor múltiplo de 10)? ");
            int valor = scan.nextInt();
            while (valor % 10 != 0){
                System.out.println("Você deve selecionar um número múltiplo de 10. Tente novamente");
                System.out.print("Quanto deseja sacar? ");
                valor = scan.nextInt();
            }
            int[] notas = new int[]{100, 50, 20, 10};
            int[] notasEntregues = new int[4];
            int i = 0;
            while (valor != i) {
                if (valor >= 100) {
                    notasEntregues[0]++;
                    valor = valor - 100;
                } else if (valor >= 50) {
                    notasEntregues[1]++;
                    valor = valor - 50;
                } else if (valor >= 20) {
                    notasEntregues[2]++;
                    valor = valor - 20;
                } else if (valor >= 10) {
                    notasEntregues[3]++;
                    valor = valor - 10;
                }
            }
            System.out.println("Notas entregues:");
            if (notasEntregues[0] > 0) {
            System.out.println(notasEntregues[0] + " x R$100"); }
            if (notasEntregues[1] > 0) {
            System.out.println(notasEntregues[1] + " x R$50"); }
            if (notasEntregues[2] > 0) {
            System.out.println(notasEntregues[2] + " x R$20"); }
            if (notasEntregues[3] > 0) {
            System.out.println(notasEntregues[3] + " x R$10"); }

            System.out.print("\nGostaria de sacar novamente (s/n)? ");
            resposta = scan.next().charAt(0);
            while (resposta != 's' && resposta != 'S' && resposta != 'n' && resposta != 'N') {
                System.out.println("Pressione 's' para SIM e 'n' para NÃO");
                System.out.println("Gostaria de sacar novamente? ");
                resposta = scan.next().charAt(0);
            }
        } while (resposta == 's' || resposta == 'S');

        scan.close();
    }
}
