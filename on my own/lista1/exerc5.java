package lista1;
import java.util.Scanner;
public class exerc5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,med;
        System.out.println("\nDigite a primeira nota");
        x = sc.nextDouble()*0.4;//Primeira nota vale somente 40%
        System.out.println("Digite a segunda nota");
        y = sc.nextDouble()*0.6;//Segunda nota vale 60%
        med = x + y;//Média aritmética soma o valor das notas e divide pela quantidade de notas, enquanto a ponderada serve para determinar um peso para cada nota. 
        System.out.println("A média do aluno é " + med);
        sc.close();
    }
}
