package lista1;
import java.util.Scanner;

public class exerc4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y;
        double med;
        System.out.print("\nDigite a primeira nota");
        x = sc.nextDouble();
        System.out.println("Digite a segunda nota");
        y = sc.nextDouble();
        med = (x + y) / 2;
        // Média aritmética é o valor das notas somado, divido pela quantidade de notas
        // (temos duas notas x e y, seus valores serão determinados pelo Scanner e então
        // dividir por 2, se forem 3 notas, divide por 3, se forem 4, divide por 4...)
        System.out.println("A média aritmética é " + med);
        if ((med * 100) / 10 >= 70) { // Se o valor da média for maior que 70%, então o aluno foi aprovado
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
        sc.close();
    }
}
