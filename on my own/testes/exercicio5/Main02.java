package exercicio5;
import java.util.Scanner;
import java.util.ArrayList;
public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        final int TAMANHO = 5;
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("Digite um número inteiro: ");
            int valor = sc.nextInt();
            numeros.add(valor);
            System.out.println("Tam atual: " + numeros.size());
        }

        numeros.remove(2);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.print(numeros.get(i) + " ");
        }
        sc.close();
    }
}
