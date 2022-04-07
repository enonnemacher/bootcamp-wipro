package exercicio02;

public class Aluno {

    private Integer matricula;
    private String nome;
    private Double notaProva1;
    private Double notaProva2;
    private Double notaTrabalho;

    public Aluno(Integer matricula, String nome, Double notaProva1, Double notaProva2, Double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public Double media(Double notaProva1, Double notaProva2, Double notaTrabalho) {
        return (notaProva1 * 1.5) * (notaProva2 * 1.5) * (notaTrabalho * 2) / 3;
    }

    public Integer recuperacao() {
        if (media(notaProva1, notaProva2, notaTrabalho) > 7d) return 0;
        else return 1;
    }
}
