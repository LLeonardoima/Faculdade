package lista1;
import java.util.Scanner;

public class exerc8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seconds = sc.nextInt();
        int minutes = seconds / 60;
        int hours = minutes / 60;
        int days = hours / 24;
        if (hours >= 24) {
            System.out.println(days + " dias e " + (hours % 24) + ":" + (minutes % 60) + ":" + (seconds % 60));
        } else if (minutes >= 60) {
            System.out.println(hours + ":" + (minutes % 60) + ":" + (seconds % 60));

        } else if (seconds >= 60) {
            System.out.println(hours + ":" + minutes + ":" + (seconds % 60));

        } else {
            System.out.println(hours + ":" + minutes + ":" + seconds);
        }

        sc.close();
        // Se a quantidade de segundos for suficiente pra dar 1 dia inteiro, ela vai
        // mostrar o resultado primeiro com os dias, nos debaixo vai removendo, pra
        // mostrar só as horas, minutos ou segundos
    }
}
