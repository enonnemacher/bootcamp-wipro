package main;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);

        ArrayList<String> candidatos = new ArrayList<>();
        int[] votos = new int[4];
        int quantidadeAlunos = 0, voto;

        System.out.println("Digite o nome do primeiro candidato: ");
        candidatos.add(leitorTeclado.nextLine());
        System.out.println("Digite o nome do segundo candidato: ");
        candidatos.add(leitorTeclado.nextLine());
        System.out.println("Digite o nome do terceiro candidato: ");
        candidatos.add(leitorTeclado.nextLine());
        System.out.println("Digite o nome do quatro candidato: ");
        candidatos.add(leitorTeclado.nextLine());

        while (quantidadeAlunos < 4) {
            System.out.println("Escolha um candidato: ");
            System.out.printf("1 - %s \n", candidatos.get(0));
            System.out.printf("2 - %s \n", candidatos.get(1));
            System.out.printf("3 - %s \n", candidatos.get(2));
            System.out.printf("4 - %s \n", candidatos.get(3));
            voto = leitorTeclado.nextInt();
            if (voto == 1) votos[0]++;
            else if (voto == 2)
                votos[1]++;
            else if (voto == 3)
                votos[2]++;
            else votos[3]++;
            quantidadeAlunos++;
        }

        System.out.println("*** Finalizado ***");
        System.out.printf("1 - %s : %d votos\n", candidatos.get(0), votos[0]);
        System.out.printf("2 - %s : %d votos\n", candidatos.get(1), votos[1]);
        System.out.printf("3 - %s : %d votos\n", candidatos.get(2), votos[2]);
        System.out.printf("4 - %s : %d votos\n", candidatos.get(3), votos[3]);
        if (votos[0] > votos[1] && votos[0] > votos[2] && votos[0] > votos[3])
            System.out.printf("O vencedor foi %s ", candidatos.get(0));
        else if (votos[1] > votos[2] && votos[1] > votos[3])
            System.out.printf("O vencedor foi %s ", candidatos.get(1));
        else if (votos[2] > votos[3])
            System.out.printf("O vencedor foi %s ", candidatos.get(2));
        else System.out.printf("O vencedor foi %s ", candidatos.get(3));
    }
}
