package exercicio5;

public class Pessoa {
    private String nome;
    private int Idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        Idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }
}