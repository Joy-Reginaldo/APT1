import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário o número para o qual queremos gerar a tabuada
        System.out.print("Digite um número para ver sua tabuada: ");
        int numero = scanner.nextInt();

        // Mostra a tabuada do número de 1 a 10 utilizando um loop
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        scanner.close(); // Fechar o scanner no final para liberar recursos
    }
}