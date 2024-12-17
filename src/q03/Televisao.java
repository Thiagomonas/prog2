package q03;

public class Televisao {
    private final int numCanais = 10;
    private int canal = 1;
    private final int maxVolume = 10;
    private int volume = 1;

    public void setVolume(int volume) {
        if (volume > 0 && volume <= maxVolume) {
            this.volume = volume;
        }
    }
    public void setCanal(int canal) {
        if (canal > 0 && canal <= numCanais) {
            this.canal = canal;
        }
    }
    public int getCanal() {
        return canal;
    }
    public int getVolume() {
        return volume;
    }
}
