package exercicio01;

public class Televisao {

    private Integer volume;
    private Integer canal;

    public Televisao(Integer volume, Integer canal) {
        this.volume = volume;
        this.canal = canal;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getCanal() {
        return canal;
    }

    public void setCanal(Integer canal) {
        this.canal = canal;
    }

    public void aumentarVolume() {
        this.volume += 1;
    }

    public void diminuirVolume() {
        this.volume -= 1;
    }

    public void aumentarCanal() {
        this.canal += 1;
    }

    public void diminuirCanal() {
        this.canal -= 1;
    }

    public void trocarCanal(Integer canal){
        this.setCanal(canal);
    }

    public Integer consultarVolume(){
        return this.getVolume();
    }

    public Integer consultarCanal(){
        return this.getCanal();
    }
}
