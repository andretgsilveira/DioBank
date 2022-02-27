package conta;

public class Cliente {
    String nome;
    int CPF;

    public Cliente(String nome, int CPF) {
        this.nome = nome;
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public int getCPF() {
        return CPF;
    }
}
