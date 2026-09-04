package aula0309;
// Leia o valor do investimento p de uma pessoa em
//uma conta poupança, e a taxa de juros r anual (em
//%). Assumindo que todo o juro é deixado em
//depósito, calcule e mostre a quantidade de dinheiro a
//na conta no fim de cada ano durante n anos ( n
//                                                     será lido).
//        – Fórmula : a = p (1 + r) n
//– a : quantidade em depósito no fim do n-ésimo ano
//– p : quantidade original investida
//– r : taxa de juros anual
//– n : número de ano
//– XY= Math.pow (x,y)

import java.util.Scanner;

public class ExercicioInvestimento {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p,r,n;
        System.out.println("Capital: ");
        p = sc.nextDouble();
        System.out.println("taxa anual em (%)");
        r = sc.nextDouble();
        System.out.println("Tempo (anos): ");
        n = sc.nextInt();
        double porc = r / 100;
        for (int i = 1; i <= n; i++ ){
            double a = (p * Math.pow(1 + porc, i));
            System.out.printf(String.format("\n montante no ano" + " " + i  + " " + "é igual a :  %.2f", a  ));
        }
    }


}
