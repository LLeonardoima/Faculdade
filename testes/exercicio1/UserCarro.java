package exercicio1;

public class UserCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Chevrolet", "Onix", 13);
        Carro carro2 = new Carro("McLaren", "F1", 70, 5.4, 59);
        System.out.println(carro1.Refuel(34));
        System.out.println(carro1.Drive(90));
        System.out.println(carro1.show());
        System.out.println(carro2.Drive(250));
        System.out.println(carro2.show());
    }
}
