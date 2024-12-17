package q03;

public class Main {
    public static void main(String[] args) {
        ControleRemoto controle = new ControleRemoto();
        controle.aumentarVolume();
        System.out.println(controle.getVolume());

        controle.diminuirVolume();
        System.out.println(controle.getVolume());

        controle.trocarCanal(5);
        System.out.println(controle.getCanal());

        controle.aumentarCanal();
        System.out.println(controle.getCanal());

        controle.diminuirCanal();
        System.out.println(controle.getCanal());
    }
}
