public class Principal {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();

        cc.imprimirExtrato();
        cc.depositar(58978);
        System.out.println();
        cc.imprimirExtrato();

        cc.transferir(150, cp);
        System.out.println();
        cp.imprimirExtrato();

        cp.sacar(25);
        System.out.println();
        cp.imprimirExtrato();

    }
}
