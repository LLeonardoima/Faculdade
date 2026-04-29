package lista2;

import java.util.Scanner;

public class exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        String y = "java123";
        System.out.println("\nDigite a senha");
        x = sc.next();
        while (!x.equals(y)) {
            System.out.println("Senha incorreta, tente novamente!");
            x = sc.next();
        }
        System.out.println("Senha correta! Acesso permitido");
        sc.close();
    }
}
