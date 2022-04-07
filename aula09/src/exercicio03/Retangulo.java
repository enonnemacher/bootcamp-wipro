package exercicio03;

public class Retangulo implements FormaGeometrica {
    @Override
    public String cor() {
        return "vermelho";
    }

    @Override
    public String quantidadeDeLados() {
        return "Quatro";
    }

    @Override
    public double area(double a, double b) {
        return a * b;
    }
}
