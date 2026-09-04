package aula2708;

import java.util.Scanner;
public class Aula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o raio");
        double raio = sc.nextDouble();

        double diametro = 2 * raio;
        double circuferencia = 2 * Math.PI * raio;
        double area =  Math.PI * Math.pow(raio,2);

        System.out.println("diametro " + diametro);
        System.out.println("circuferencia " + circuferencia);
        System.out.println("area " + area);
    }
}