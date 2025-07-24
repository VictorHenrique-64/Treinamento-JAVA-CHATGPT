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
        String nome = "";
        int idade = 0;
        int DDD = 0;
        int telefone = 0;

        System.out.println("\n\\~\\~\\~\\~\\ SISTEMA DE CADASTRO DE USUÁRIOS /~/~/~/~/\n");

        do {
            System.out.println("Pessoas cadastradas: " + nomes.size());
            System.out.println("[1] Cadastrar uma nova pessoa");
            System.out.println("[2] Remover uma pessoa já cadastrada");
            System.out.println("[3] Listar todas as pessoas cadastradas");
            System.out.println("[4] Listar apenas maiores de idade (+18) cadastrados");
            System.out.println("[5] Sair do sistema");
            System.out.print("Selecione umas das opções acima: ");
            resposta = scan.nextInt();

            switch (resposta) {
                case 1:
                    scan.nextLine();
                    System.out.println("\n        * INSIRA AS INFORMAÇÕES DA PESSOA QUE DESEJA CADASTRAR *\n");
                    while (nome.length() <= 2) {
                        System.out.print("Nome completo: ");
                        nome = scan.nextLine();
                        if (nome.length() > 2) {
                            nomes.add(nome);
                        } else {
                            System.out.println("\n          * O NOME DA PESSOA DEVE TER NO MINIMO 2 CARACTERES. TENTE NOVAMENTE *\n");
                        }
                    }
                    while (idade <= 0) {
                        System.out.print("Idade: ");
                        if (scan.hasNextInt()) {
                            idade = scan.nextInt();
                            if (idade > 0) {
                                idades.add(idade);
                            } else {
                                System.out.println("\n          * A PESSOA DEVE TER NO MINIMO 1 ANO DE IDADE. TENTE NOVAMENTE *\n");
                            }
                        } else {
                            System.out.println("\n          * A IDADE NÃO DEVE CONTER LETRAS, APENAS NÚMERO. TENTE NOVAMENTE *\n");
                            scan.next();
                        }
                    }

                    while (DDD < 10 || DDD > 99) {
                        System.out.print("DDD: ");
                        if (scan.hasNextInt()) {
                            DDD = scan.nextInt();
                            if (DDD >= 10 && DDD <= 99) {
                                DDDs.add(DDD);
                            } else {
                                System.out.println("\n          * O DDD DEVE CONTER DOIS DIGITOS. TENTE NOVAMENTE *\n");
                            }
                        } else {
                            System.out.println("\n          * O DDD NÃO DEVE CONTER LETRAS, APENAS NÚMERO. TENTE NOVAMENTE *\n");
                            scan.next();
                        }
                    }
                    while (telefone <= 9999999 || telefone > 99999999) {
                        System.out.print("telefone: 9");
                        if (scan.hasNextInt()) {
                            telefone = scan.nextInt();
                            if (telefone >= 9999999 && telefone <= 99999999) {
                                telefones.add(telefone);
                            } else {
                                System.out.println("\n         * O TELEFONE DEVE CONTER 8 DIGITOS *\n");
                            }
                        } else {
                            System.out.println("\n          * O TELEFONE NÃO DEVE CONTER LETRAS, APENAS NÚMERO. TENTE NOVAMENTE *\n");
                            scan.next();
                        }
                    }

                    System.out.println("\n      * PESSOA CADASTRADA COM SUCESSO * \n");
                    nome = "";
                    idade = 0;
                    DDD = 0;
                    telefone = 0;
                    break;

                case 2:
                    if (nomes.isEmpty()) {
                        System.out.println("\n    * NENHUMA PESSOA CADASTRADA NO MOMENTO *\n");
                    } else {
                        System.out.println("\n1 - * REMOVER TODOS *");
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println((i + 2) + " - " + nomes.get(i));
                        }
                        int respostaCase2 = 0;
                        int totalPessoasCase2 = nomes.size() + 1; //vai contar a partir do 2, pois o 1 remove todos
                        while (respostaCase2 > totalPessoasCase2 || respostaCase2 < 1) {
                            System.out.print("Qual dessas pessoas deseja remover? ");
                            respostaCase2 = scan.nextInt();
                            if (respostaCase2 == 1) {
                                nomes.clear();
                                idades.clear();
                                DDDs.clear();
                                telefones.clear();
                                System.out.println("\n          * TODAS AS PESSOAS FORAM REMOVIDAS COM SUCESSO *\n");
                            } else if (respostaCase2 > 1 && respostaCase2 <= totalPessoasCase2) {
                                int indice = respostaCase2 - 2;
                                nomes.remove(indice);
                                idades.remove(indice);
                                DDDs.remove(indice);
                                telefones.remove(indice);
                                System.out.println("\n          * PESSOA REMOVIDA COM SUCESSO *\n");
                            } else {
                                System.out.println("\n          * '" + respostaCase2 + "' É UMA OPÇÃO VAZIA. TENTE NOVAMENTE COM UMA OPÇÃO VÁLIDA\n");
                            }
                        }
                    }
                    break;

                case 3:
                    if (nomes.isEmpty()) {
                        System.out.println("\n    * NENHUMA PESSOA CADASTRADA NO MOMENTO *");
                    } else {
                        int respostaCase3 = 0;
                        while (respostaCase3 != 1 && respostaCase3 != 2) {
                            System.out.println("\n[1] Mostrar apenas o primeiro nome das pessoas");
                            System.out.println("[2] Mostrar as informações completa das pessoas");
                            System.out.print("Selecione umas das opções acima: ");
                            respostaCase3 = scan.nextInt();
                            System.out.print("\n");
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
                                System.out.println("          * '" + respostaCase3 + "' NÃO É UMA OPÇÃO VÁLIDA. TENTE NOVAMENTE *");
                            }
                        }
                    }
                    System.out.print("\n");
                    break;

                case 4:
                    if (nomes.isEmpty()) {
                        System.out.println("\n    * NENHUMA PESSOA CADASTRADA NO MOMENTO *");
                    } else {
                        int respostaCase4 = 0;
                        while (respostaCase4 != 1 && respostaCase4 != 2) {
                            System.out.println("\n[1] Mostrar apenas o primeiro nome das pessoas");
                            System.out.println("[2] Mostrar as informações completa das pessoas");
                            System.out.print("Selecione umas das opções acima: ");
                            respostaCase4 = scan.nextInt();
                            System.out.print("\n");
                            if (respostaCase4 == 1) {
                                int cont = 1;
                                for (int i = 0; i < nomes.size(); i++) {
                                    if (idades.get(i) >= 18) {
                                        String primeiroNome = nomes.get(i).split(" ")[0];
                                        System.out.println(cont + " - " + primeiroNome);
                                        cont++;
                                    }
                                }
                            } else if (respostaCase4 == 2) {
                                int cont = 1;
                                for (int i = 0; i < nomes.size(); i++) {
                                    if (idades.get(i) >= 18) {
                                        System.out.println(cont + " - " + nomes.get(i) + " - Idade: " + idades.get(i) + " - Telefone: (" + DDDs.get(i) + ") 9" + telefones.get(i));
                                        cont++;
                                    }
                                }
                            } else {
                                System.out.println("          * '" + respostaCase4 + "' NÃO É UMA OPÇÃO VÁLIDA. TENTE NOVAMENTE *");
                            }
                        }
                    }
                    System.out.print("\n");
                    break;

                case 5:
                    break;

                case 64:
                    //Estou testando este código várias vezes e, em todas elas, preciso cadastrar pessoas para realizar os testes, e isso já está chato demais.
                    //Por isso, criei a case 64. Todas as vezes que eu selecionar esse número, ele irá cadastrar automaticamente 6 usuários. É tipo um cheat.

                    nomes.add("Victor Henrique Ramos Jacó"); // 1
                    idades.add(21);
                    DDDs.add(31);
                    telefones.add(72562536);

                    nomes.add("Silvana Bitencourt Ramos"); // 2
                    idades.add(48);
                    DDDs.add(31);
                    telefones.add(99592015);

                    nomes.add("Matusalém Ramos Jacó");  // 3
                    idades.add(49);
                    DDDs.add(31);
                    telefones.add(85548497);

                    nomes.add("Davi Augusto Bitencourt"); // 4
                    idades.add(14);
                    DDDs.add(31);
                    telefones.add(87208418);

                    nomes.add("Carlos Augusto César"); // 5
                    idades.add(17);
                    DDDs.add(15);
                    telefones.add(71874090);

                    nomes.add("Paulo Ricardo dos Santos"); // 6
                    idades.add(18);
                    DDDs.add(35);
                    telefones.add(72562536);

                    System.out.println("\n          * PESSOAS CADASTRADAS COM SUCESSO * \n");
                    break;

                default:
                    System.out.println("\n          * '" + resposta + "' NÃO É UMA OPÇÃO VÁLIDA. TENTE NOVAMENTE *\n");
                    break;
            }
        } while (resposta != 5);

        System.out.println("\n          * ATÉ A PRÓXIMA! *");

        nomes.clone(); //nem sei porque coloquei isso kkkkkkkk, mas vou deixar aí porque entreguei para o chatGPT dessa forma
        scan.close();

    }
}