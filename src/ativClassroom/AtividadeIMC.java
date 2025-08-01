package ativClassroom;

import java.util.Scanner;

public class AtividadeIMC {
 public static void main(String[] args) throws Exception{
    float peso, altura, IMC;
    String nome;
   
    //Objeto para receber a entrada do teclado
    Scanner teclado = new Scanner(System.in);


    System.out.println("\nDigite o seu nome: ");
    nome = teclado.nextLine();
    System.out.println("Digite seu peso em kg: ");
    peso = teclado.nextFloat();
    System.out.println("Digite sua altura em metros: ");
    altura = teclado.nextFloat();


    IMC = peso/(altura*altura);


    if (IMC < 18.5){
        System.out.println("Seu resultado: Magreza");
    }
    else if (IMC >= 18.5 && IMC <= 24.9){
        System.out.println("Seu resultado: Normal");
    }
    else if (IMC >= 25 && IMC <= 29.9){
        System.out.println("Seu resultado: Sobrepeso");
    }
    else if (IMC >= 30 && IMC <= 34.9){
        System.out.println("Seu resultado: Obesidade grau I");
    }
    else if (IMC >= 35 && IMC <= 39.9){
        System.out.println("Seu resultado: Obesidade grau II");
    }
    else{
        System.out.println("Seu resultado: Obesidade grau III");
    }
   }
}
