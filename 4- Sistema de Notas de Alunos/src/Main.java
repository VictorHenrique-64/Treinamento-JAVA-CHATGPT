import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> alunos = new ArrayList<String>();

        int resposta;

        System.out.println("\n ~~~~ SISTEMA DE NOTAS ~~~~\n");
        do {
            System.out.println("[1] Cadastrar aluno");
            System.out.println("[2] Listar alunos e médias");
            System.out.println("[3] Mostrar aprovados");
            System.out.println("[4] Mostrar reprovados");
            System.out.println("[5] Sair");
            System.out.print("Selecione uma opção: ");
            resposta = scan.nextInt();

            switch (resposta) {
                case 1 :
                    System.out.println("Nome completo do aluno(a): ");
                    String nome = scan.nextLine();
                    System.out.println("Nota 1: ");
                    int nota1 = scan.nextInt();
                    System.out.println("Nota 2: ");
                    int nota2 = scan.nextInt();
            }

        } while ();

        scan.close();
    }
}