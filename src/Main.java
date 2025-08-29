import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    UsuarioService service = new UsuarioService();

    int opcao;

    do{
        System.out.println("\n==== CADASTRO DE USUAROO ====");
        System.out.println("1 - Adicionar usuário");
        System.out.println("2 - Listar usuário");
        System.out.println("3 - Conferir usuário");
        System.out.println("4 - Remover usuário");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao){
            case 1 -> {
                System.out.println("Nome do usuário");
                String nome_user = sc.nextLine();
                service.cadastrar(nome_user);
            }
            case 2 -> service.listarUsuario();
            case 3 -> {
                System.out.println("ID do usuário: ");
                int id = sc.nextInt();
                service.verificarCadastro(id);
            }
            case 4 -> {
                System.out.println("ID do usuário: ");
                int id = sc.nextInt();
                service.remover_usuario(id);
            }
            case 0 -> System.out.println("Saindo do sistema.");
            default -> System.out.println("Opção inválida.");

        }
    } while (opcao != 0 );
    sc.close();
    }
}