package conta;

public class ContaPoupanca extends Conta {
    public static final String TIPO_DE_CONTA = "Conta Poupanca";

    public ContaPoupanca(Cliente cliente) {
        super(cliente, TIPO_DE_CONTA);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Poucpança ===");
        imprimirInfos();
    }

}
