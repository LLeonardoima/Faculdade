package exercicio2;

public class Telefone {
    private Cliente cliente1;
    private String number;
    private double balance;

    public Telefone(String number) {
        this(null, number, 0);
    }

    public Telefone(Cliente name, String number, double balance) {
        this.cliente1 = name;
        setNumber(number);
        setBalance(balance);
    }

    public String setNumber(String number) {
        if (number == null || number.trim().isEmpty()) {
            return "\nERRO: Telefone não informado!";
        } else if (number.length() != 11) {
            return "ERRO: Telefone inválido, deve ter 11 dígitos. Você digitou " + number.length();
        } else if (!number.matches("\\d+")) {
            return "O telefone deve conter apenas números!";
        } else {
            this.number = number;
            return "Número definido: " + this.number;
        }
    }

    public String setBalance(double balance) {
        if (balance < 0) {
            this.balance = 0;
            return "Saldo inválido. Definindo como 0.";
        } else {
            this.balance = balance;
            return "Saldo definido: " + this.balance;
        }
    }

    public String Call() {
        if (this.balance <= 0.5) {
            return "Saldo insuficiente para completar ligação. Saldo atual: R$ " + balance;
        } else {
            this.balance -= 0.5;
            return "Ligação realizada com sucesso! Saldo restante: R$ " + this.balance;
        }
    }

    public String Recharge(double recharge) {
        if (recharge > 0) {
            this.balance += recharge;
            return "Recarga de R$ " + recharge + " relizada com sucesso!\nSeu saldo atual é R$: " + this.balance;
        } else {
            return "Erro: O valor mínimo de recarga deve ser maior que R$ 0,00";
        }
    }

    public String show() {
        return "Nome do usuário: " + cliente1.getName() + "\nTelefone: " + number + "\nSaldo " + balance;
    }
}
