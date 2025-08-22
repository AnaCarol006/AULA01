package aula1508teste;

import aula1508encapsulamento.Pessoa;

public class Teste {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();

        p.setIdade(10);
        p.setNome("Heloisa");

        System.out.println("Nome: " + p.getNome() );
        System.out.println("Idade: " + p.getIdade() );
    }

}
