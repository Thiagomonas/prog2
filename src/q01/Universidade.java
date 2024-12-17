package q01;

import java.util.ArrayList;

public class Universidade {
    private String nome;
    private ArrayList<Departamento> departamentos;

    public Universidade(String nomeUniversidade, Departamento departamento) {
        this.setNome(nomeUniversidade);

        this.departamentos = new ArrayList<Departamento>();
        this.departamentos.add(departamento);
    }

    public Universidade(String nome){
        this.setNome(nome);
        this.departamentos = new ArrayList<Departamento>();
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void adicionarDepartamento(Departamento departamento){
        this.departamentos.add(departamento);
    }

    public void printDepartamentos(){
        for(Departamento departamento : this.departamentos){
            System.out.println(departamento.getNome());
            departamento.printPessoas();
        }
    }
}
