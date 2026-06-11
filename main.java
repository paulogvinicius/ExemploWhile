import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int senhaCorreta = 1234;
        
        System.out.println("Digite a sua senha:");
        int senhaDigitada = leitor.nextInt();

        // O loop valida a condição ANTES de entrar.
        // Enquanto a senha estiver errada, ele continua pedindo.
        while (senhaDigitada != senhaCorreta) {
            System.out.println("Senha incorreta! Tente novamente:");
            senhaDigitada = leitor.nextInt(); // Atualiza a variável para evitar loop infinito
        }

        System.out.println("Acesso permitido. Bem-vindo!");
        leitor.close();
    }
}
