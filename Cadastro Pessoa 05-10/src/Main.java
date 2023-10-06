import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bem Vindo ao Sistema de Cadastro de Pessoa Fisica e Pessoa Juridica");

        Scanner scanner = new Scanner(System.in);
        int opcao = scanner.nextInt();

        do {

            System.out.println("Escolha uma opção: 1 - Pessoa Fisica / 2 - Pessoa Juridica / 0 - Sair");

            switch (opcao) {
                case 1:
                    int opcaoPf;

                    do {

                        System.out.println("Escolha uma opção: Cadastrar Pessoa Fisica / 2 - Lista Pessoa Fisica / 0 - Voltar ao menu anterio");
                        opcaoPf = scanner.nextInt();

                        switch (opcaoPf) {

                            case 1:
                                PessoaFisica novapf = new PessoaFisica();
                                Endereco novoEndPf = new Endereco();


                                System.out.println("Digite o nome da pessoa fisica: ");
                                novapf.nome = scanner.next();

                                System.out.println("Digite o CPF: ");
                                novapf.cpf = scanner.next();

                                System.out.println("Digite o rendimento mensal (Digite Somente numero): ");
                                novapf.rendimento = scanner.nextInt();

                                System.out.println("Digite a data de Nascimento (dd/MM/aaaa): ");

                                System.out.println("Digite o Logradouro: ");
                                novoEndPf.logadouro = scanner.next();

                                System.out.println("Digite o número");
                                novoEndPf.numero = scanner.next();

                                System.out.println("Este endereço é comercial? S/N: ");
                                

                                break;
                            case 2:
                                break;
                            case 0:
                                System.out.println("Voltando ao menu anterior");
                                break;
                            default:
                                break;
                            System.out.println("Opçao invalida, por favor digite uma opcao valida");
                        }

                    } while (opcaoPf != 0);

                    break;

                case 2:
                    break;

                case 0:
                    System.out.println("Obrigado por utilizar o nosso sistema! Forte Abraço! ");
                    break;
                default:
                    System.out.println("Opçao invalida, por favor digite uma opcao valida");
                    break;
            }

        } while (opcao != 0);

    }
}