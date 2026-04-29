package exercicio5;

import java.util.ArrayList;

public class MainPessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Yorshka", 6));
        pessoas.add(new Pessoa("Oscar", 17));
        pessoas.add(new Pessoa("Engyi", 42));
        pessoas.add(new Pessoa("Karla", 21));
        System.out.println("Pessoas com mais de 20 anos");
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa p = pessoas.get(i);
            if (p.getIdade() > 20) {
                System.out.println(pessoas.get(i).getNome());
            }
        }
        for (Pessoa p : pessoas) { // conhecido como foreach (para cada " "), serve para encurtar um for
            if (p.getIdade() > 20) {
                System.out.println(p.getNome());
            }
        }
    }
}
