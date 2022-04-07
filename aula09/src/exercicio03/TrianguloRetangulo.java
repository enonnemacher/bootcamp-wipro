package exercicio03;

public class TrianguloRetangulo implements FormaGeometrica {
    @Override
    public String cor() {
        return "Verde";
    }

    @Override
    public String quantidadeDeLados() {
        return "Tres";
    }

    @Override
    public double area(double a, double b) {
        return (a * b) / 2;
    }
}
