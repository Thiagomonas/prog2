package q01;

public class Main {
    public static void main(String[] args){
        String letras = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        Universidade universidade = new Universidade("UFPA");

        for (int i = 0; i < 3; i++){
            Departamento departamento = new Departamento(letras.substring(i, i+1));

            Pessoa pessoa1 = new Pessoa(letras.substring(i, i+1), letras.substring(i, i+1), numeros.substring(i, i+1));
            Pessoa pessoa2 = new Pessoa(letras.substring(i+1, i+2), letras.substring(i+1, i+2), numeros.substring(i+1, i+2));
            departamento.adicionarPessoa(pessoa1);
            departamento.adicionarPessoa(pessoa2);

            universidade.adicionarDepartamento(departamento);
        }

        universidade.printDepartamentos();
    }
}
