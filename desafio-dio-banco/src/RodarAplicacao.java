public class RodarAplicacao {
    public static void main(String[] args) {
       Conta cc = new ContaCorrente();

       IConta cliente = new ContaPoupanca();

       cc.depositar(200);
       
       Conta cp = new ContaPoupanca();
       cp.imprimirExtrato();

       cc.imprimirExtrato();

       cc.transferir(100, cp);

       cp.imprimirExtrato();

    }
    
}
