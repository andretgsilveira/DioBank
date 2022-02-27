import banco.Banco;
import conta.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

public class Main {

    public static void main(String[] args) {

        Banco DioBank = new Banco();

        Cliente Andre = new Cliente("Andre",123456);

        Conta cc = new ContaCorrente(Andre);
        System.out.println(cc.getAgencia());
        System.out.println(cc.getConta());
        System.out.println(cc.getSaldo());

        cc.depositar(500);
        System.out.println(cc.getSaldo());

        cc.sacar(505);

        cc.sacar(200);
        System.out.println(cc.getSaldo());

        Conta cp = new ContaPoupanca(Andre);

        cc.tranferir(150,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();

        Cliente Paula = new Cliente("Paula", 9876543);
        ContaCorrente paula = new ContaCorrente(Paula);

        System.out.println(paula.getTipoDeConta());


        DioBank.imprimeClientes();
    }
}
