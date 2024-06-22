import java.util.Scanner;

public class Login {
    private static final String USUARIO_CORRETO = "java8";
    private static final String SENHA_CORRETA = "java8";
    private static final int TENTATIVAS_MAXIMAS = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativasRestantes = TENTATIVAS_MAXIMAS;

        while (tentativasRestantes > 0) {
            System.out.print("Digite o usuário: ");
            String usuario = scanner.nextLine();
            System.out.print("Digite a senha: ");
            String senha = scanner.nextLine();

            if (usuario.equals(USUARIO_CORRETO) && senha.equals(SENHA_CORRETA)) {
                System.out.println("Login realizado com sucesso!");
                break;
            } else {
                tentativasRestantes--;
                if (tentativasRestantes > 0) {
                    System.out.println("Usuário ou senha incorretos. Tentativas restantes: " + tentativasRestantes);
                } else {
                    System.out.println("Você excedeu o número de tentativas permitidas. Acesso bloqueado.");
                }
            }
        }

        scanner.close();
    }
}