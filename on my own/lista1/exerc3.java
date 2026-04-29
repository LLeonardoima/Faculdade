package lista1;
import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite um número");
        int x = sc.nextInt();
        if (x % 2 == 0) {
            // se um número for divido por 2 e tiver sobras, ou seja, uma divisão não exata,
            // significa que o número é ímpar, se ele passar por uma divisão exata, ele é
            // par.
            System.out.println("\n" + x + " é um número par");
        } else {
            System.out.println("\n" + x + " é um número ímpar");
        }
        sc.close();
    }
}
