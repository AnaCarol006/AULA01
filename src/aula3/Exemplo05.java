package aula3;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //camelCase
        String nomeAluno;
        double nota1 = 0, nota2 = 0;
        

        System.out.print("\nDigite seu nome: ");
        nomeAluno = input.nextLine();

        System.out.print("Digite nota 1: ");
        nota1 = input.nextDouble();

        System.out.print("Digite nota 2: ");
        nota2 = input.nextDouble();

        double média = (nota1 + nota2) / 2;

        System.out.println("Média: " + média);

        if(média >= 6){
            System.out.println("Aprovado!");
            if(média == 10){
                System.out.println("Parabéns" + nomeAluno);
            }
        }
        if(média < 6){
            System.out.println("Reprovado");
        }

    }
    

}