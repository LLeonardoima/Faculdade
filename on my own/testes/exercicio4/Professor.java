package exercicio4;

public class Professor extends Pessoa {
    private double salario;

    public Professor(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String show() {
        return super.show() + ", R$: " + salario;
    }
}
