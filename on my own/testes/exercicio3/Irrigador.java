package exercicio3;

import java.util.Scanner;
import java.util.Random;

public class Irrigador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Quantas fileiras?");
        int x = sc.nextInt();
        System.out.println("Quantos aspersores por fileira?");
        int y = sc.nextInt();
        System.out.println();
        String resultado;
        for (int a = 1; a <= x; a++) {
            System.out.println("Verificando Fileira " + a);
            for (int b = 1; b <= y; b++) {
                double z = random.nextDouble();
                if (z < 0.7) {
                    resultado = "OK";
                } else {
                    resultado = "Falha";
                }
                System.out.println("Aspersor " + b + ", " + a + ": " + resultado);
            }
            System.out.println();
        }
        sc.close();
        /*
         * x = Quantidade de máxima fileiras
         * y = Quantidade máxima de aspersores
         * z = Fator de aleatoriedade
         * a = Fileira
         * b = Aspersor
         */
    }
}
