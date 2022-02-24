public class Main {

    public static void main(String[] args) {
        Cliente Mario = new Cliente();
        Mario.setNome("Mario Bueno");

        Conta cc = new ContaCorrente(Mario);
        Conta poupanca = new ContaPoupanca(Mario);

        cc.depositar(300);
        cc.transferir(0, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }


}