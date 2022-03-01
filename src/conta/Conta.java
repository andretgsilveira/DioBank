package conta;

import java.util.Date;

public abstract class Conta{

    private static final  int AGENCIA_DIGITAL = 1;
    private static int CONTA = 1;

    protected int agencia ;
    protected int conta;
    protected double saldo = 0;
    protected Cliente cliente;
    protected String tipoDeConta;

    public Conta(Cliente cliente, String tipoDeConta){
        this.agencia = Conta.AGENCIA_DIGITAL;
        this.conta = CONTA++;
        this.saldo = saldo;
        this.cliente = cliente;
        this.tipoDeConta = tipoDeConta;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return conta;
    }

    public Cliente getCliente() { return cliente; }

    public  String getTipoDeConta() { return tipoDeConta; }

    public void sacar(double valor){
        if (saldo > valor){
            saldo -= valor;
        }else{
            System.out.println("Não existe saldo disponivel para esta transação");
        }
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void tranferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public void imprimirExtrato(){
    }

    protected void imprimirInfos(){
        Date dataAtual = new Date();
        System.out.println(dataAtual);
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.conta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}
