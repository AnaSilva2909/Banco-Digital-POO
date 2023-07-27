public abstract class Conta implements IConta{

    protected static final int AGENCIA_PADRAO = 0;

    protected int agencia;
    protected int conta;
    protected double saldo;

    private static int SEQUENCIAL= 1;
  
    public Conta(){
       this.agencia  = Conta.AGENCIA_PADRAO;
       this.conta =  SEQUENCIAL++;
    }

   

    public int getAgencia() {
        return agencia;
    }
    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo = valor - saldo;

    }

    @Override
    public void depositar(double valor) {
        saldo = valor + saldo;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
       this.sacar(valor);
       contaDestino.depositar(valor);
    }

    protected void imprimirInfoComuns(){
        System.out.println(String.format("Agencia:%d", this.agencia));
        System.out.println(String.format("Conta:%d", this.conta));
        System.out.println(String.format("Saldo:%.2f", this.saldo));
    }

    
}