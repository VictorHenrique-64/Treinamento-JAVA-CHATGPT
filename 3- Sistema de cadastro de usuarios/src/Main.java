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
            System.out.println("[1] Cadastrar uma nova pessoa");
            System.out.println("[2] Remover uma pessoa já cadastrada");
            System.out.println("[3] Listar todas as pessoas cadastradas");
            System.out.println("[4] Listar apenas maiores de idade (+18) cadastrados");
            System.out.println("[5] Sair do sistema");
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
                        System.out.println("    * Nenhuma pessoa cadastrada no momento*");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(nomes.get(i));
                            System.out.print("Qual dessas pessoas deseja remover? ");
                            int respostaCase2 = scan.nextInt();
                            nomes.remove(respostaCase2);
                        }
                    }
                    break;

                case 3:
                    if (nomes.isEmpty()) {
                        System.out.println("    * Nenhuma pessoa cadastrada no momento*");
                    } else {
                        int respostaCase3 = 0;
                        while (respostaCase3 != 1 && respostaCase3 != 2) {
                            System.out.println("[1] Mostrar apenas o primeiro nome das pessoas");
                            System.out.println("[2] Mostrar as informações completa das pessoas");
                            System.out.print("Selecione umas das opções acima: ");
                            respostaCase3 = scan.nextInt();
                            if (respostaCase3 == 1) {
                                for (int i = 0; i < nomes.size(); i++) {
                                    String primeiroNome = nomes.get(i).split(" ")[0];
                                    System.out.println((i + 1) + " - " + primeiroNome);
                                }
                            } else if (respostaCase3 == 2) {
                                for (int i = 0; i < nomes.size(); i++) {
                                    System.out.println((i + 1) + " - " + nomes.get(i) + " - Idade: " + idades.get(i) + " - Telefone: (" + DDDs.get(i) + ") 9" + telefones.get(i));
                                }
                            } else {
                                System.out.println("'" + respostaCase3 + "' não é uma opção válida, tente novamente.");
                            }
                        }
                    }
                    break;

                case 4:
                    if (nomes.isEmpty()) {
                        System.out.println("    * Nenhuma pessoa foi cadastrada *");
                    } else {
                        int respostaCase4 = 0;
                        while (respostaCase4 != 1 && respostaCase4 != 2) {
                            System.out.println("[1] Mostrar apenas o primeiro nome das pessoas");
                            System.out.println("[2] Mostrar as informações completa das pessoas");
                            System.out.print("Selecione umas das opções acima: ");
                            respostaCase4 = scan.nextInt();
                            if (respostaCase4 == 1) {
                                for (int i = 0; i < nomes.size(); i++) {
                                    if (idades.get(i) >= 18) {
                                        String primeiroNome = nomes.get(i).split(" ")[0];
                                        System.out.println((i + 1) + " - " + primeiroNome);
                                    }
                                }
                            } else if (respostaCase4 == 2) {
                                for (int i = 0; i < nomes.size(); i++) {
                                    if (idades.get(i) >= 18) {
                                        System.out.println((i + 1) + " - " + nomes.get(i) + " - Idade: " + idades.get(i) + " - Telefone: (" + DDDs.get(i) + ") 9" + telefones.get(i));
                                    }
                                }
                            } else {
                                System.out.println("'" + respostaCase4 + "' não é uma opção válida, tente novamente.");
                            }
                        }
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("'" + resposta + "' não é uma opção válida, tente novamente.");
                    break;
            }
        } while (resposta != 5);

        nomes.clone();
        scan.close();

    }
}
//.size()