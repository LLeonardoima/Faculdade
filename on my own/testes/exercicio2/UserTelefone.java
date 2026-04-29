package exercicio2;
public class UserTelefone {
    public static void main(String[] args) {
        Cliente pessoa = new Cliente("Leonardo");
        Telefone celular = new Telefone(pessoa, "11989269734", 20);
        System.out.println(celular.Call());
        System.out.println(celular.Recharge(12.50));
        System.out.println(celular.show());
    }
}
