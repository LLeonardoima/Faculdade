package lista2;

import java.util.Scanner;

public class exerc7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x;
        double y = 0;
        double z = 0;
        double a = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "° número:");
            x = sc.nextDouble();
            if (x > 0) {
                y++;
            }
            if (x < 0) {
                z++;
            }
            if (x == 0) {
                a++;
            }
        }
        System.out.println(
                (int) y + " números são positivos\n" + (int) z + " números são negativos\n" + (int) a
                        + " números são iguais à 0");
        sc.close();
    }
}
