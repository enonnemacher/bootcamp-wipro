package exercicio04;

public class Funcionario {

    private String nome;
    private String CPF;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, String CPF, Double salario) {
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double bonus(Double bonus) {
        return getSalario() * bonus;
    }
}
