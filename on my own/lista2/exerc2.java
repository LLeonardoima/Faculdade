package lista2;
import java.util.Scanner;
public class exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nDigite um número inteiro");
        int x = sc.nextInt();
        while (x>=0) {
            System.out.println(x);
            x--;
        }
        //while() funciona de uma forma parecida ao for()
        //enquanto o for() é necessário declara tudo no construtor
        //o while() funciona de forma separada while(condição) {
        //o que vai ocorrer enquanto a condição for verdadeira
        ///quebra ou consequência pós loop
        //}
        sc.close();
    }
}
