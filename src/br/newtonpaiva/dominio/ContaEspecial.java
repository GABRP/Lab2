package br.newtonpaiva.dominio;

public class ContaEspecial extends Conta{
    private Double limite;

    @Override
    public  Double sacar(Double valor){
        if(getSaldo() + limite < valor)
            throw new IllegalStateException("");

        setSaldo(getSaldo() - valor) ;

        return getSaldo();
    }

    public Double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
