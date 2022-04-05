package main;

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

        if (media >= 6) System.out.printf("Aluno %s aprovado com média: %.1f ", nomeAluno, media);
        else System.out.printf("Aluno %s reprovado com média: %.1f", nomeAluno, media);
    }
}
