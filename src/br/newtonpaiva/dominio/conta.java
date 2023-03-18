package br.newtonpaiva.dominio;

import java.util.Objects;

public class conta  {
    private Integer numero;

    private Double saldo;

    //construtor
    public conta(){
        this(null);
    }
    //construtor
    public conta(Integer numero){
        this(numero, 0.0);
    }
    //construtor
    public conta(Integer numero, Double saldo){
        this.numero = numero;
        this.saldo = saldo;
    }
    public Double sacar(Double valor){

        return 0.0;
    }
    public Double depositar(Double valor){
        if(valor == null || valor <=0)
            throw new IllegalArgumentException("depósito mínimo de 1 centavo");
        saldo += valor;
        return saldo;
    }
    public void transferir(conta destino, Double valor){
        if(this.getSaldo() < valor)
            throw new IllegalArgumentException( "Invalido");

        if(this.equals(destino))
            throw new IllegalArgumentException("Invalido");
        this.sacar(valor);
        destino.depositar(valor);


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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            conta conta = (conta) o;
            return Objects.equals(numero, conta.numero);
        }


        @Override
        public int hashCode() {
            return Objects.hash(numero);
        }
    }