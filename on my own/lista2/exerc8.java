package lista2;

import java.util.Scanner;
public class exerc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double y = 0;
        double z = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + i + "º número");
            double x = sc.nextDouble();
            if (x > 0) {
                y += x;
            }
        }
        sc.close();
    }
}
