package exercicio03;

public class Circulo implements FormaGeometrica {
    @Override
    public String cor() {
        return "azul";
    }

    @Override
    public String quantidadeDeLados() {
        return "Nenhum";
    }

    @Override
    public double area(double a, double b) {
        return Math.PI * Math.pow(a, 2);
    }
}
