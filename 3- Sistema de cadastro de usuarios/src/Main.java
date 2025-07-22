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

        System.out.println("\n\\~\\~\\~\\~\\ SISTEMA DE CADASTRO DE USUÁRIOS /~/~/~/~/\n");

        do {
            System.out.println("[1] Cadastrar pessoa");
            System.out.println("[2] Listar todas as pessoas");
            System.out.println("[3] Cadastrar pessoa");
            System.out.println("[4] Sair do sistema");
            System.out.print("Selecione umas das opções acima: ");
            resposta = scan.nextInt();

            switch (resposta) {
                case 1:
                    System.out.println("    * Insira as informações da pessoa que deseja cadastrar *");
                    System.out.print("Nome completo: ");
                    scan.nextLine();
                    nome = scan.nextLine();
                    nomes.add(nome);

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
                    if (nomes.isEmpty()) {
                        System.out.println("    * Nenhuma pessoa foi cadastrada *");
                    } else {
                        int respostaCase2 = 0;
                        while (respostaCase2 != 1 && respostaCase2 != 2) {
                            System.out.println("[1] Mostrar apenas o primeiro nome das pessoas");
                            System.out.println("[2] Mostrar as informações completa das pessoas");
                            System.out.print("Selecione umas das opções acima: ");
                            respostaCase2 = scan.nextInt();
                            for (int cont = 1; cont <= nomes.size(); cont++) {
                                if (respostaCase2 == 1) {
                                    for (String n : nomes) {
                                        String primeiroNome = n.split(" ")[0];
                                        System.out.println(cont + " - " + primeiroNome);
                                    }
                                } else if (respostaCase2 == 2) {
                                    for (int i = 0; i < nomes.size(); i++) {
                                        System.out.println(cont + " - " + nomes.get(i) + " - Idade: " + idades.get(i) + " - Telefone: (" + DDDs.get(i) + ") 9" + telefones.get(i));
                                    }
                                } else {
                                    System.out.println("'" + respostaCase2 + "' não é uma opção válida, tente novamente.");
                                    //caso não houver armazenado nenhuma pessoa, printar que não há pessoas para exibir
                                }
                            }

                        }
                    }
                    break;

                case 3:

                    break;
            }
        } while (resposta != 4);

        nomes.clone();
        scan.close();

    }
}
//.size()