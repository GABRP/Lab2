package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.conta;

public class Main {
    public static void main(String[] args) {
        conta c = new conta();
        c.setNumero(10);
        c.setSaldo(100.0);

        conta c2 = new conta();
        c2.setNumero(9);
        c2.setSaldo(60.0);


        c.depositar( 50.0);
        c.depositar( 50.0);

        System.out.println("você possui " +c.getSaldo()+ " reais de saldo em sua conta");
    }
}