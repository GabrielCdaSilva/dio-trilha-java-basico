import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Banco banco = new Banco();
		Cliente cliente = new Cliente();
		
		System.out.println("Bem vindo aos nossos serviços! Banco " + banco.getNome());
		System.out.print("Digite seu nome: ");
		cliente.setNome(scanner.nextLine());
		
		
		Conta conta = new ContaCorrente(cliente, banco);
		
		while (true) {
            // Exibindo o menu de opções
            System.out.println("\nMenu de opções:");
            System.out.println("1. Sacar");
            System.out.println("2. Depositar");
            System.out.println("3. Consultar extrato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1: // Sacar
                    System.out.print("Informe o valor para sacar: ");
                    conta.sacar(scanner.nextDouble());
                    break;
                case 2: // Depositar
                	System.out.print("Informe o valor para depositar: ");
                    conta.depositar(scanner.nextDouble());
                case 3: // Consultar extrato
                	conta.imprimirExtrato();
                    break;
                case 4: // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
