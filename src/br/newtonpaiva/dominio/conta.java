package br.newtonpaiva.dominio;

public class conta  {
    private Integer numero;

    private Double saldo;

    public Double sacar(Double valor){
        return 0.0;
    }
    public Double depositar(Double valor){
        return 0.0;
    }
    public Integer getNumero(){
        return numero;
    }
    public void setNumero(Integer numero){
        if(numero == null || numero < 0)
            throw new IllegalArgumentException(" Erro, número inválido");

        this.numero = numero;
    }

}