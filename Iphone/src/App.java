import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Iphone iphone = new Iphone();

        int opcao;
        while (true) {
            // Exibe o menu de opções
            System.out.println("\nMenu do iPhone:");
            System.out.println("1. Tocar Música");
            System.out.println("2. Pausar Música");
            System.out.println("3. Selecionar Música");
            System.out.println("4. Fazer Ligação");
            System.out.println("5. Atender Ligação");
            System.out.println("6. Iniciar Correio de Voz");
            System.out.println("7. Entrar no Navegador");
            System.out.println("8. Adicionar Nova Aba");
            System.out.println("9. Atualizar Página");
            System.out.println("10. Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            // Verifica a opção escolhida usando o switch-case
            switch (opcao) {
                case 1:
                    iphone.tocarMusica();
                    break;
                case 2:
                    iphone.pausarMusica();
                    break;
                case 3:
                    iphone.selecionarMusica();
                    break;
                case 4:
                    iphone.ligar();
                    break;
                case 5:
                    iphone.atender();
                    break;
                case 6:
                    iphone.iniciarCorreioVoz();
                    break;
                case 7:
                    iphone.exibirPagina();
                    break;
                case 8:
                    iphone.adicionarNovaAba();
                    break;
                case 9:
                    iphone.atualizarPagina();
                    break;
                case 10:
                    System.out.println("Saindo do aplicativo...");
                    scanner.close();
                    return; // Sai do loop e finaliza o programa
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}
