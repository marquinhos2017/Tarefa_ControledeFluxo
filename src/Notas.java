import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Recebendo as quatro notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        System.out.print("Digite a quarta nota: ");
        double nota4 = scanner.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        // Determinando o status do aluno
        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media > 5 && media < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        // Exibindo a média
        System.out.printf("Média: %.2f%n", media);

        scanner.close();
    }
}
