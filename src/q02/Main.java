package q02;

public class Main {
    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 3);

        for (int i = 0; i < 5; i++){
            elevador.entraPessoa();
        }
        elevador.sobeAndar();
        elevador.sobeAndar();
        System.out.println(elevador.getPessoas() + " | " + elevador.getAndarAtual());

        elevador.saiPessoa();
        elevador.saiPessoa();
        elevador.saiPessoa();
        elevador.sobeAndar();
        System.out.println(elevador.getPessoas() + " | " + elevador.getAndarAtual());

        elevador.entraPessoa();
        elevador.desceAndar();
        System.out.println(elevador.getPessoas() + " | " + elevador.getAndarAtual());
    }
}
