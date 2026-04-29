package lista1;
import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int original = valor;
        int n100 = valor / 100;
        valor %= 100;
        int n50 = valor / 50;
        valor %= 50;
        int n20 = valor / 20;
        valor %= 20;
        int n10 = valor / 10;
        valor %= 10;
        int n5 = valor / 5;
        valor %= 5;
        int n2 = valor / 2;
        valor %= 2;
        int n1 = valor;
        System.out.println(original);
        System.out.println(n100 + " nota(s) de R$100");
        System.out.println(n50 + " nota(s) de R$50");
        System.out.println(n20 + " nota(s) de R$20");
        System.out.println(n10 + " nota(s) de R$10");
        System.out.println(n5 + " nota(s) de R$5");
        System.out.println(n2 + " nota(s) de R$2");
        System.out.println(n1 + " moeda(s)");
        sc.close();
        // Aqui oq ele faz é manter uma variável pra guardar o valor digitado, e outra
        // pra dividir,ele divide pela cédula pra saber quantas daquela cédula vai
        // precisar, e depois faz a divisão da sobra, e refaz esse processo, exemplo:
        // 250(divide por 100, dá 2, duas cédulas de 100) e depois faz a sobra, 50 que
        // então divide por 50, ou seja, vai precisar de duas notas de 100 e uma nota de
        // 50
    }
}
