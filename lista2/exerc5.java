package lista2;

import java.util.Scanner;

public class exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y = 0;
        double z;
        double soma = 0;
        System.out.println("\nQuantas notas serão lidas?");
        x = sc.nextInt();
        for (int i = 1; i <= x; i++) {
            System.out.println("Digite o valor da " + i + "ª nota:");
            z = sc.nextDouble();
            if (z >= 0 && z <= 10) {
                soma += z;
                y++;
            } else {
                System.out.println("Valor inválido, nota decartada!");

            }
        }
        if (y > 0) {
            double media = (soma / y);
            System.out.printf("\nMédia das notas válidas: %2f%n", media);
        } else {
            System.out.println("\nNenhuma nota válida informada!");
        }
        sc.close();
    }
}
/*
 * x = Quantidade de notas que serão lidas
 * y = Quantidade de notas válidas (Salva o valor de z, soemnte se fizer parte
 * do critério das notas válidas)
 * z = Valor das notas
 * soma = Soma todas as notas(independente se for válida ou não)
 */