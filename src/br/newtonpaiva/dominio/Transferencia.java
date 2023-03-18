package br.newtonpaiva.dominio;

public interface Transferencia { //interface não permite adicionar atributos,somente ação (métodos)

    void transferir(conta destino, Double valor); // quando usar a interface transferência, verá o método "Transferir"
}