package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.*;

public class Main {
    public static void main(String[] args) {
        conta c = new conta(10);
//        c.setNumero(10);
        c.setSaldo(100.0);
        c.depositar( 50.0);
//        c.depositar( 50.0);
        conta c2 = new conta();
        c2.setNumero (10);
        c2.setSaldo(500.0);
        conta c3 = new conta();
        if(c.equals(c2)){
            System.out.println("Contas iguais");
        }
        else{
            System.out.println("Contas divergentes");
        }
        System.out.println("você possui " +c.getSaldo()+ " reais de saldo em sua conta");

        //Pessoa p = new Pessoa(){



        Pessoa pessoas[] = new Pessoa[4];
        pessoas[0] = new PessoaFisica();
        pessoas[1] = new PessoaJuridica();
        pessoas[2] = new PessoaJuridica();
        pessoas[3] = new PessoaFisica();


        for(Pessoa p : pessoas)
            p.validarDocumento();
    }
}