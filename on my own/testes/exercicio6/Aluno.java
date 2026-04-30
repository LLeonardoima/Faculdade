package exercicio6;

public class Aluno extends Pessoa {
    private double nota;

    public Aluno(String nome, double nota) {
        super(nome);
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return super.toString() + ", nota: " + nota;
    }

}
// Classe Aluno, que herda da pessoa, somente com adição da nota