package lista1;
import java.util.Scanner;
public class exerc7 {
    public static void main(String[] agrs) {
        double result,p1,p2,x1,x2,y1,y2;
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=");
        x1 = sc.nextDouble();
        System.out.println("\n= " + x1);
        x2 = sc.nextDouble();
        System.out.println("\n= " + x1 + " "+ x2);
        y1 = sc.nextDouble();
        System.out.println("\n= " + x1 + " "+ x2 + " "+ y1);
        y2 = sc.nextDouble();
        System.out.println("\n= " + x1 + " "+ x2 + " "+ y1 + " " + y2);
        p1 = Math.pow((x2 - x1),  2); // Math.pow funciona como (número ou equação, potência - não importa se é 2 ou 728), por exemplo - Math.pow(3, 2) que no caso é 3²
        p2 = Math.pow((y2 - y1), 2);
        result = Math.sqrt(p1 + p2); // Math.sqrt faz a raíz quadrada da equação ou número colocado nos parênteses dele
        System.out.println("V(x2 - x1)² + (y2 - y1)² = " + result);
        sc.close();
    }
}
