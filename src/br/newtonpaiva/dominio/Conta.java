package br.newtonpaiva.dominio;

public class Conta {
    private Integer numero;
    private Double saldo;

    public Double sacar(Double valor) {
        return 0.0;
    }

    public Double depositar(Double valor) {
        return 0.0;
        if(valor == null || valor <= 0 )
            throw new IllegalArgumentException("Valor menor ou");

        saldo += valor;
        return saldo;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
