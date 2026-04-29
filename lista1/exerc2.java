package lista1;
import java.util.Scanner;
public class exerc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("\nDigite um número");
        x = sc.nextInt();
        if(x>0) { //números negativos são menores que zero, se o número digitado for maior que zero, ele é positivo.
            System.out.println("\n"+x+" é um número positivo");
        }
        else {
            System.out.println("\n"+x+" é um número negativo");
        }
        sc.close();
    }
}
