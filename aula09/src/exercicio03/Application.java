package exercicio03;

public class Application {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Quadrado quadrado = new Quadrado();
        Retangulo retangulo = new Retangulo();
        TrianguloRetangulo trianguloRetangulo = new TrianguloRetangulo();

        System.out.println("Área do círculo: " + circulo.area(3d,5d));
        System.out.println("Área do quadrado: " + quadrado.area(10d,7d));
        System.out.println("Área do retangulo: " + retangulo.area(6d,2d));
        System.out.println("Área do triângulo retângulo: " + trianguloRetangulo.area(9d,4d));
    }
}
