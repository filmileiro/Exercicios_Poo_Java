public class Conta {

    private double saldo;
    private int agencia;
    private int numero;
    Cliente cliente;
    PJ pj;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return cliente;
    }

    public void setTitular(Cliente titular) {
        this.cliente = titular;
    }

    public void deposita(double valor) {
        this.saldo += valor;
    }

    public boolean saca(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            System.out.println("Saldo insuficiente");
            return false;
        }
    }
    /*tranferindo de uma conta A para uma conta B*/
    public boolean tranfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            System.out.println("O saldo é insufisciente ");
            return false;
        }


    }


}
