package lista1;
import java.util.Scanner;
public class exerc6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,z; //distância = x, combustível = y, consumo médio = z
        System.out.println("\nQuantos km foram percorridos?");
        x = sc.nextDouble();
        System.out.println("Quantos litros de combustível foram consumidos?");
        y = sc.nextDouble();
        z = x / y;
        if(z % 2 == 0) {
            System.out.println("O consumo médio do veículo foi de " + (int)z);    
        }
        else {
            System.out.println("O consumo médio do veículo foi de " + z);
        }
        sc.close();
    }
}
