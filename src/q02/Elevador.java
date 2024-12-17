package q02;

public class Elevador {
    private int andarAtual = 0;
    private int totalAndares;
    private int pessoas = 0;
    private int capacidade;

    public Elevador(int totalAndares, int capacidade) {
        this.setTotalAndares(totalAndares);
        this.setCapacidade(capacidade);
    }

    public void setTotalAndares(int totalAndares) {
        if (totalAndares > 0) {
            this.totalAndares = totalAndares;
        }
    }
    public int getTotalAndares() {
        return totalAndares;
    }

    public void setAndarAtual(int andarAtual) {
        if (andarAtual >= 0) {
            this.andarAtual = andarAtual;
        }
    }
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setCapacidade(int capacidade){
        if (capacidade > 0) {
            this.capacidade = capacidade;
        }
    }
    public int getCapacidade() {
        return capacidade;
    }

    public void setPessoas(int pessoas) {
        if (pessoas >= 0) {
            this.pessoas = pessoas;
        }
    }
    public int getPessoas() {
        return pessoas;
    }

    public void entraPessoa(){
        if (this.getPessoas() < this.getCapacidade()) {
            setPessoas(this.getPessoas() + 1);
        }
    }
    public void saiPessoa(){
        if (this.getPessoas() > 0) {
            this.setPessoas(this.getPessoas() - 1);
        }
    }

    public void sobeAndar(){
        if (this.getAndarAtual() < this.getTotalAndares()) {
            this.setAndarAtual(this.getAndarAtual() + 1);
        }
    }
    public void desceAndar(){
        if (this.getAndarAtual() > 0) {
            this.setAndarAtual(this.getAndarAtual() - 1);
        }
    }
}
