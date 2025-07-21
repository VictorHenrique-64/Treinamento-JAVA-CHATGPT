import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<String>();
        ArrayList<Integer> idades = new ArrayList<Integer>();
        ArrayList<Integer> DDDs = new ArrayList<Integer>();
        ArrayList<Integer> telefones = new ArrayList<Integer>();

        int resposta;
        String nome;
        int idade;
        int DDD;
        int telefone;
        int respostaPessoas = 0;

        do {
            System.out.println("\n\\~\\~\\~\\~\\ SISTEMA DE CADASTRO DE USUÁRIOS /~/~/~/~/\n");
            System.out.println("[1] Cadastrar pessoa");
            System.out.println("[2] Listar todas as pessoas");
            System.out.println("[3] Cadastrar pessoa");
            System.out.println("[4] Sair do sistema");
            System.out.print("Selecione umas das opções acima: ");
            resposta = scan.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("Insira as informações da pessoa que deseja cadastrar:");
                    System.out.print("Nome completo: ");
                    nome = scan.nextLine();
                    nomes.add(nome);

                    System.out.println(" ");
                    System.out.print("Idade: ");
                    idade = scan.nextInt();
                    idades.add(idade);

                    System.out.print("DDD: ");
                    DDD = scan.nextInt();
                    DDDs.add(DDD);

                    System.out.print("telefone: 9");
                    telefone = scan.nextInt();
                    telefones.add(telefone);

                    System.out.println(" * Pessoa cadastrada com sucesso * ");
                    break;

                case 2:
                    while (respostaPessoas != 1 && respostaPessoas != 2) {
                        System.out.print("[1] Mostrar apenas o primeiro nome das pessoas");
                        System.out.print("[2] Mostrar as informações completa das pessoas");
                        System.out.println("Selecione umas das opções acima: ");
                        respostaPessoas = scan.nextInt();

                        if (respostaPessoas == 1) {
                            //String primeiroNome = nome.split(" ")[0];
                            System.out.println(nomes);
                        } else if (respostaPessoas == 2) {
                            //caso não houver armazenado nenhuma pessoa, printar que não há pessoas para exibir
                            System.out.println("Nome: " + nomes + " - Idade: " + idades + " - Telefone: (" + DDDs + ") 9" + telefones);
                        } else {
                            System.out.println("'" + respostaPessoas + " não é uma opção válida, tente novamente.");
                        }
                    }
                    break;

                case 3:

                    break;
            }
        } while (resposta != 4) ;

            nomes.clone();
            scan.close();

    }
}