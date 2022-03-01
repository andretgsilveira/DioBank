import conta.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        //Criação de cliente
        Cliente Andre = new Cliente("Andre",123456);

        //Criação da conta corrente para o cliente Andre
        Conta cc = new ContaCorrente(Andre);
        System.out.println(cc.getAgencia());
        System.out.println(cc.getConta());
        System.out.println(cc.getSaldo());

        //Deposito na conta corrente
        cc.depositar(500);
        System.out.println(cc.getSaldo());

        //Saque de valor superior ao existente na conta
        cc.sacar(505);

        //Saldo de valor parcial da conta
        cc.sacar(200);
        System.out.println(cc.getSaldo());

        //Criação de conta poupança
        Conta cp = new ContaPoupanca(Andre);

        //Transferencia de valor da conta corrente para conta poupança
        cc.tranferir(150,cp);

        //Deposito em conta poupança
        System.out.println(cp.getSaldo());
        cp.depositar(150.0);
        System.out.println(cp.getSaldo());

        //Impressão dos extratos das contas
        cc.imprimirExtrato();
        cp.imprimirExtrato();

    }
}
