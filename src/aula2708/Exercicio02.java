package aula2708;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o nome");
        String nome = sc.nextLine();

        System.out.println("digite o peso: ");
        double peso = sc.nextDouble();

        System.out.println("digite a idade: ");
        int idade = sc.nextInt();

        System.out.println("digite a altura");
        double altura = sc.nextDouble();

        double PesoHomem = (72.7 * altura) - 58.00;
        double PesoMulher = (62.1 * altura) - 44.70;

        System.out.printf(String.format("peso ideal para homem: %.2f\n" , PesoHomem )) ;
        System.out.printf(String.format("peso ideal para mulher: %.2f", PesoMulher)) ;
    }
}
