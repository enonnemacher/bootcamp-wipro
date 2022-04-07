package exercicio02;

public class Application {

    public static void main(String[] args) {
        Aluno aluno = new Aluno(001, "Ederson", 9d, 8d, 9.5d);
        System.out.println("Resultado da média: " + aluno.media(aluno.getNotaProva1(), aluno.getNotaProva2(), aluno.getNotaTrabalho()));
        if(aluno.recuperacao() == 1) System.out.println("Aluno em recuperação");
        else System.out.println("Aluno aprovado");
    }
}