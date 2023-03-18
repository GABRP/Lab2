package br.newtonpaiva.dominio;

public class ContaEspecial extends conta{ // extends indica que a class ContaEspecial é
    // uma herança(subclasse) da classe conta/ só pode usar uma vez

    private Double limite;

    @Override
    public Double sacar(Double valor){
        if(valor >getSaldo() + limite)
            throw new IllegalArgumentException("");

        setSaldo(getSaldo());

        return getSaldo();

    }


    public Double getLimite(){
        return limite;


    }
}