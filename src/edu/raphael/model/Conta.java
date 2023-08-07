package edu.raphael.model;

public abstract class Conta {

    protected static int AGENCIA_PADRAO = 0010;
    protected static int SEQUENCIAL = 0;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = Conta.SEQUENCIAL++;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void sacar(double valor) throws Exception {
        if(this.saldo >= valor) {
            saldo -= valor;
        } else{
            throw new Exception("Valor insuficiente para sacar");
        }
    }
    public void depositar(double valor){
        saldo += valor;
    }
    public void transferir(double valor, Conta contaDestino){
        try {
            this.sacar(valor);
            contaDestino.depositar(valor);
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public abstract void imprimrExtrato();

}
