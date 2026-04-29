package exercicio4;

public class Aluno extends Pessoa {
    private int ra;

    public Aluno(String nome, int ra) {
        super(nome);
        this.ra = ra;
    }

    public int getRA() {
        return ra;
    }

    @Override
    public String show() {
        return super.show() + ", RA: " + ra;
    }

/*     @Override
    public String toString() {
        return super.show() + ", RA: " + ra;
    } */

}
