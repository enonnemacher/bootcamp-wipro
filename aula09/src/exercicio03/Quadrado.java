package exercicio03;

public class Quadrado implements FormaGeometrica {
    @Override
    public String cor() {
        return "Amarelo";
    }

    @Override
    public String quantidadeDeLados() {
        return "Quatro";
    }

    @Override
    public double area(double a, double b) {
        return a * 2;
    }
}
