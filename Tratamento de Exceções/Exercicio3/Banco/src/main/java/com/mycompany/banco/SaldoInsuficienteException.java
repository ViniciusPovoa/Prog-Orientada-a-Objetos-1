
package com.mycompany.programaconta;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException() {
        super("Saldo insuficiente!");
    }
    
    public SaldoInsuficienteException(String mensagem) {
        super(mensagem);
    }
}