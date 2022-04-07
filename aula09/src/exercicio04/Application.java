package exercicio04;

public class Application {

    public static void main(String[] args) {

        Funcionario desenvolvedor = new Funcionario("Ederson", "123.456.789-00", 5000d);
        System.out.println(desenvolvedor.bonus(2d));

        Funcionario liderTecnico = new Funcionario();
        liderTecnico.setNome("Fulano");
        liderTecnico.setCPF("123.456.789-10");
        liderTecnico.setSalario(7000d);
        System.out.println(liderTecnico.bonus(3d));
    }
}