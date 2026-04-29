package lista2;
import java.util.Scanner;

public class exerc3 {
    public static void main(String[] args) {
        int x = 0; //Variável da soma, inicia em 0, pra posteriormente guardar o valor dos números digitados
        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <= 5; i++) {
            System.out.println("\nDigite o " + i + "º número.");
            x += sc.nextInt(); //O scanner pode agir sozinho, não necessariamente precisa estar designado uma variável
        }
        System.out.println("A soma total é " + x);
        sc.close();
    }
}
