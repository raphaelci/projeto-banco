package edu.raphael.util;

import edu.raphael.model.Conta;
import edu.raphael.model.ContaCorrente;
import edu.raphael.model.ContaPoupanca;

public enum TipoConta {

    CONTA_CORRENTE(new ContaCorrente(), 1),
    CONTA_POUPANCA(new ContaPoupanca(), 2);
    //CONTA_SALARIO(new ContaSalario, 3);

    private Conta instancia;
    private int tipoConta;

    TipoConta(Conta instancia, int tipoConta){
        this.instancia = instancia;
        this.tipoConta = tipoConta;
    }

    public Conta getInstancia() {
        return instancia;
    }

    public int getTipoConta() {
        return tipoConta;
    }


}
