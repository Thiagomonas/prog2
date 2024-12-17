package q01;

import java.util.ArrayList;

public class Departamento {
    private String nome;
    private ArrayList<Pessoa> pessoas;

    public Departamento(String nomeDepartamento, String nomePessoa, String email, String telefone){
        this.setNome(nomeDepartamento);
        this.pessoas = new ArrayList<Pessoa>();
        this.pessoas.add(new Pessoa(nomePessoa, email, telefone));
    }

    public Departamento(String nome){
        this.setNome(nome);
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void adicionarPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }

    public void printPessoas(){
        for (Pessoa pessoa : this.pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
