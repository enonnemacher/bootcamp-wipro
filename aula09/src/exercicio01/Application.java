package exercicio01;

public class Application {

    public static void main(String[] args) {

        Televisao televisao = new Televisao(0, 0);
        televisao.aumentarVolume();
        televisao.aumentarCanal();
        System.out.println("Volume atual " + televisao.consultarVolume());
        System.out.println("Canal atual " + televisao.consultarCanal());
        televisao.trocarCanal(5);
        System.out.println("Canal atual " + televisao.consultarCanal());

    }
}
