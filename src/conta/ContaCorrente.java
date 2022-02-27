package conta;

public class ContaCorrente extends Conta {
    public static final String TIPO_DE_CONTA = "Conta Corrente";

    public ContaCorrente(Cliente cliente) {
        super(cliente, TIPO_DE_CONTA);
    }

    @Override
    public void imprimirExtrato(){
        System.out.println("=== Extrato Conta Corrente ===");
        imprimirInfos();
    }
}
