package main;

/* Faça um programa para receber o nome de um aluno e informar 2 notas, em seguida calcular
a média do aluno e apresentar ao final a média calculada e a situação de Aprovação do aluno.
(aprovado com média >= 6).*/

import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        String nomeAluno = leitorTeclado.nextLine();

        System.out.println("Digite a primeira nota deste aluno: ");
        double nota1 = leitorTeclado.nextInt();

        System.out.println("Digite a segunda nota deste aluno: ");
        double nota2 = leitorTeclado.nextInt();
        double media = (nota1 + nota2) / 2;

        if (media >= 6) System.out.println("Aluno aprovado com média: " + media);
        else System.out.println("Aluno reprovado com média: " + media);
    }
}
