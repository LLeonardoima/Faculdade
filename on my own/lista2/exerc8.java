package lista2;

import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y = 0; // guardar o valor da maior variável
        double z = 0; // guardar o valor da menor variável
        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o " + i + "º número");
            double x = sc.nextDouble(); // valor digitado
            if (x > y) {
                y = 0;
                y += x;
            }
            if (x < z) {
                z = 0;
                z += x;
            }
        }
        sc.close();
        if (y % 2 == 0) {
            System.out.println("Número maior " + (int) y);
        } else {
            System.out.println("Número maior " + y);
        }
        if (z % 2 == 0) {
            System.out.println("Número menor " + (int) z);
        } else {
            System.out.println("Número menor " + z);
        }
    }
}
