package exercicio6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();

        alunos.add(new Aluno("Gabriel", 2.4));
        alunos.add(new Aluno("Beatriz", 7.8));
        alunos.add(new Aluno("Thiago", 0.5));
        alunos.add(new Aluno("Mariana", 9.1));
        alunos.add(new Aluno("Lucas", 4.6));

        double soma = 0;
        for (Aluno a : alunos) {
            soma += a.getNota();
        }

        double media = soma / alunos.size();
        System.out.println("Média geral " + media);

        System.out.println("Alunos acima da média geral: ");
        for (Aluno a : alunos) {
            if (a.getNota() > media) {
                System.out.println(a);
            }
        }
    }
}
// utilizar size() caso adicione ou remova um aluno, não dar erro na média