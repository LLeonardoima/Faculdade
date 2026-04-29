package lista1;
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y; // valores que eu vou digitar na calculadora
        double z; // resultado
        char operador;
        // char basicamente é uma variável que guarda qualquer coisa, a diferença é que
        // char não duas aspas "" e sim a aspa solo ''
        System.out.println("\n Calculadora\n=");
        x = sc.nextInt();
        System.out.println("Selecione seu operador\nAdição +\nSubtração -\nMultiplicação *\nDivisão /");
        operador = sc.next().charAt(0);
        // esse .charAt(0); é só pra determinar que o ponto dela inicial é zero, pq não
        // existe um nextChar por algum motivo, mas funciona se fizer esse
        // next().charAt(0)
        System.out.println("\n=  " + x + " " + operador);
        y = sc.nextInt();
        if (operador == '+') {
            z = x + y;
            System.out.println(x + " " + operador + " " + y + " = " + (int) z);
        } else {
            if (operador == '-') {
                z = x - y;
                System.out.println(x + " " + operador + " " + y + " = " + (int) z);
            } else {
                if (operador == '*') {
                    z = x * y;
                    System.out.println(x + " " + operador + " " + y + " = " + (int) z);
                } else {
                    if (operador == '/') {
                        z = (double) x / y;
                        if (z % 2 == 0) {
                            System.out.println(x + " " + operador + " " + y + " = " + z);
                        } else {
                            System.out.println(x + " " + operador + " " + y + " = " + z);
                            // só esse que não tá com (int) pq o resultado dele é quebrado, então não
                            // precisa transformar em int
                        }
                    }
                }
            }
        }
        sc.close();
    }
}