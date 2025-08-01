package aula4;

import java.util.Scanner;

public class Exemplo06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um valor para exibir a tabuada: ");
        int valor = teclado.nextInt();
        
        //inputs da repetição
        //valor inicial
        //condição de parada 
        //incremento

        int i = 1;
        while(i <= 10){
            System.out.println(valor + " X " + i + " = " + (valor*i));
            i = i + 1;
        }
    }
}

