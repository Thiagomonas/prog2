package q03;

public class ControleRemoto {
    Televisao televisao;

    public ControleRemoto() {
        televisao = new Televisao();
    }

    public void aumentarVolume(){
        televisao.setVolume(televisao.getVolume() + 1);

    }
    public void diminuirVolume(){
        televisao.setVolume(televisao.getVolume() - 1);
    }

    public void aumentarCanal(){
        televisao.setCanal(televisao.getCanal() + 1);
    }

    public void diminuirCanal(){
        televisao.setCanal(televisao.getCanal() - 1);
    }

    public void trocarCanal(int canal){
        televisao.setCanal(canal);
    }

    public int getVolume(){
        return televisao.getVolume();
    }

    public int getCanal(){
        return televisao.getCanal();
    }
}
