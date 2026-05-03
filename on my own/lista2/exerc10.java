package lista2;

import java.util.Scanner;

public class exerc10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = 1.0;
        double y = 0; // soma de números digitados
        int z = 0; // quantidade de números digitados
        System.out.println("\nDigite um número");
        while (x != 0) {
            x = sc.nextDouble(); // valor digitado
            System.out.println(x + ", ...");
            y += x;
            z++;
        }
        System.out.println("A soma de todos os números digitados foi igual a " + y);
        System.out.println("A média de números digitados foi igual a " + (y / z));
        System.out.println("A quantidade de números digitados foi " + z);
        sc.close();
    }
}
