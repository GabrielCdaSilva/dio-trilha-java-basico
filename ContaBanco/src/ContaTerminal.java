import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Por favor, digite a agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Por favor, digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, segue as informações abaixo: ");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: " + saldo + " já disponível para saque.");
    }
}
