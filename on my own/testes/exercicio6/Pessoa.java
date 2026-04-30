package exercicio6;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String toString() {
        return "Pessoa [nome= " + nome + "]";
    }

}
// Classe comum de pessoa, com somente para declarar nome e idade e mostrar o
// resultado