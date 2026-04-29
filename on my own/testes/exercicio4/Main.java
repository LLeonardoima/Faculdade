package exercicio4;

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Paulo", 123456);
        aluno1.setTelefone("(11) 98765-4321");
/*         System.out.println(aluno1.getNome());
        System.out.println(aluno1.getTelefone());
        System.out.println(aluno1.getRA()); */
        System.out.println(aluno1.show());
        System.out.println(aluno1.toString());
        Professor professor = new Professor("Claudio", 2900.00);
        professor.setTelefone("(11) 12345-6789");
        System.out.println(professor.show());
    }
}
