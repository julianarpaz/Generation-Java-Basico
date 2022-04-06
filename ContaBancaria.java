public class ContaBancaria {

    private int agencia;
    private int numeroConta;
    private String titular;
    private double saldo = 0;

    public ContaBancaria(String titular, int agencia, int numeroConta) {
        this.setTitular(titular);
        this.setAgencia(agencia);
        this.setNumeroConta(numeroConta);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito(double deposito) {
        this.saldo += deposito;
    }

    public boolean saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo na conta insuficiente para realizar esta operação!");
            return false;
        }
    }

    public void transferencia(double valor, ContaBancaria destino){
        this.saque(valor);
        destino.deposito(valor);
    }

}
