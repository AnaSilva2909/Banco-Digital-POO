public abstract class Banco extends Conta {

private String[] clientes = {"Ana", "Carlos", "Beatriz"};

private String nomeBanco = "Banco Povo" ;


public String[] getClientes() {
    return clientes;

    
}

public void setClientes(String[] clientes) {
    this.clientes = clientes;
}
}

