package br.newtonpaiva.dominio;

public abstract class Pessoa {

    private String nome;

    public abstract void validarDocumento();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}