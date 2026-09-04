package aula0309;

import java.util.Scanner;

//Leia n e mostre os números de 1 a n.
//Obs :
//Mostre apenas 5 números por linha.
//O último termo da linha não é seguido de vírgula.
//Ao final de cada bloco de 10, informe que usuário pode digitar zero para parar a seqüência.
//Use Apenas 3 Variáveis.
//        Exemplo : n = 10
//        [1,2,3,4,5]
//        [6,7,8,9,10]
//a) Faça usando o while
public class exercicioWhile {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int cont = 1;
        System.out.println("digite o numero: ");
        int n = sc.nextInt();
        int resposta =1 ;

        while (cont <= n && resposta != 0) {

            if (cont % 5 == 1)
                System.out.print("[");

            System.out.print(cont);

            if (cont % 5 == 0 || cont == n)
                System.out.println("]");
            else
                System.out.print(",");

            if (cont % 10 == 0 && cont < n) {
                System.out.println("Digite 0 para parar ou outro numero para continuar:");
                resposta = sc.nextInt();
            }

            cont++;
        }

    }
    }

