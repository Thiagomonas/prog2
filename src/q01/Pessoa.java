package q01;

public class Pessoa {
    private String nome;
    private String email;
    private String telefone;

    public Pessoa(String nome, String email, String telefone) {
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() { return nome; }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
