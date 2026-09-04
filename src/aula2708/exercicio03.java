package aula2708;

import java.util.Scanner;

public class exercicio03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite o numero da conta: ");
        int numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.println("digite o nome do cliente: ");
        String nome = sc.nextLine();
        System.out.println("saldo inicial: ");
        double saldo = sc.nextDouble();
        System.out.println("total de cobrancas: ");
        double cobranca = sc.nextInt();
        System.out.println("total de pagamentos: ");
        int totalPag = sc.nextInt();
        System.out.println("digite o limite autorizado: ");
        double limite = sc.nextInt();

        double novoSaldo = saldo + cobranca - totalPag;

        System.out.println("nome: " + nome);
        System.out.println("conta:" + numeroConta);
        System.out.println("novo saldo: " + novoSaldo);

        if (novoSaldo > limite) {
            double excedido = novoSaldo - limite;
            System.out.printf(String.format("limite de credito excedido em R$.2f",excedido));
        }else {
            double disponivel = limite - novoSaldo;
            System.out.printf(String.format("ainda pode comprar R$ %.2f reais", disponivel));
        }
    }
}
