package main;

/* 1. Escreva um programa Java que gera um número aleatório (randômico) entre 0 e 10
(incluindo estes dois valores) e peça ao usuário para adivinhá-lo. Use um laço while para
registrar as tentativas feitas e, a cada tentativa, dê dicas informando se o número gerado é
maior ou menor que a tentativa feita. Finalmente mostre a quantidade de tentativas feitas até
que o número fosse acertado */

import java.util.Random;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner leitorTeclado = new Scanner(System.in);

        int valorAleatorio = random.nextInt(10);
        int valorDigitado = 50, contador = 0;

        System.out.println("Tente adivinhar o valor entre 0 e 10");
        while (valorAleatorio != valorDigitado) {
            System.out.println("Digite um valor entre 0 e 10: ");
            valorDigitado = leitorTeclado.nextInt();

            if (valorDigitado == valorAleatorio)
                System.out.println("Parabéns, você acertou!");
            else if (valorDigitado > valorAleatorio)
                System.out.println("Tente novamente, o valor que você digitou é maior");
            else
                System.out.println("Tente novamente, o valor que você digitou é menor");

            contador++;
        }
        System.out.printf("Você efetuou %d tentativas", contador);
    }
}
