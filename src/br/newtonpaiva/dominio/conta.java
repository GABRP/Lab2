package br.newtonpaiva.dominio;
public class conta  {
    private Integer numero;
    private Double saldo;

    public Double sacar(Double valor){

        return 0.0;
    }
    public Double depositar(Double valor){

        if(valor == null || valor <=0)
            throw new IllegalArgumentException("depósito mínimo de 1 centavo");
        saldo += valor;
        return saldo;
    }
    public Integer getNumero(){

        return numero;
    }
    public void setNumero(Integer numero){
        if(numero == null || numero < 0)
            throw new IllegalArgumentException(" Erro, número inválido");

        this.numero = numero;
    }
    public void setSaldo(Double saldo){

        this.saldo = saldo;
    }
    public Double getSaldo(){

        return saldo;

    }



}