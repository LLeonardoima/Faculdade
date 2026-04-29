package exercicio2;

public class Cliente {
    private String name;

    public Cliente(String name) {
        setName(name);
    }

    public String setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            this.name = "NOME NÃO INFORMADO";
            return "ERRO: Nome não informado!";
        } else {
            this.name = name;
            return "Nome definido: " + this.name;
        }
    }

    public String getName() {
        return name;
    }
}
