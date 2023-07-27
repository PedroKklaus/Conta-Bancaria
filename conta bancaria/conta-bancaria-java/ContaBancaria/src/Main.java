import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContaBancaria contaBancaria = new ContaBancaria();

    System.out.println("=========================");
    System.out.println("Olá, seja bem-vindo(a)!");
    System.out.println("Sou Charles do banco Falido's & Quebrados, vou te ajudar em suas transações");
    System.out.println("=========================");

    System.out.println("\n Qual é o seu nome?");
    contaBancaria.setNomeCompleto(scanner.nextLine());
    System.out.println("\nSeja bem-vindo " + contaBancaria.getNomeCompleto() + " o seu saldo inical é de R$ 100.00");

    int opcao;
    int x = 0;
do {
    System.out.println("\nSelecione uma das opções: ");
    System.out.println("1 -Resgate");
    System.out.println("2 - Depósito");
    System.out.println("3 - Visualização dos dados da conta e saldo");
    System.out.println("4 - Investir dinheiro");
    opcao = scanner.nextInt();

    switch (opcao) {
        case 1: {
            contaBancaria.resgateDinheiro();
            break;
        }
        case 2: {
            contaBancaria.depositoBancario();
            break;
        }
        case 3: {
            contaBancaria.visualizarConta();
            break;
        }
        case 4: {
            contaBancaria.investimentoBancario();
            break;
        }
        default:
            System.out.println("Opção inválida, digite um valor de 1 a 4");
            break;
    }
    double total = contaBancaria.getValorInvestido() * 1.05;
}while (x != 4 );






    }
}