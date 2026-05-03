package lista2;

import java.util.Scanner;

public class exerc9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (x == 0) {
            System.out.println("Menu");
            System.out.println("[1] Somar dois números");
            System.out.println("[2] Subtrair dois números");
            System.out.println("[3] Sair");
            int y = sc.nextInt();
            if (y == 1) {
                System.out.println("Somar dois números\nDigite dois números");
                double num1 = sc.nextDouble();
                System.out.println(num1 + " + ");
                double num2 = sc.nextDouble();
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
            if (y == 2) {
                System.out.println("Subtrair dois números\nDigite dois números");
                double num1 = sc.nextDouble();
                System.out.println(num1 + " - ");
                double num2 = sc.nextDouble();
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
            if (y == 3) {
                System.out.println("Sair\nEncerrando...");
                x++;
            }
        }
        sc.close();
    }
}
