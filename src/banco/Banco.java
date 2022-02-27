package banco;

import conta.Conta;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static String BANCO = "DioBank";
    private static List<Conta> contas = new ArrayList<>();
    private String nome;

    public Banco(){

    }

    public Banco(Conta conta){
        this.nome = BANCO;
        contas.add(conta);
    }

    public void imprimeClientes(){
        for (Conta conta : contas) {
            System.out.print(String.format("Conta: %s", conta.getTipoDeConta()));
            System.out.print(String.format("Cliente: %s", conta.getCliente().getNome()));
            System.out.println();
        }
    }
}
