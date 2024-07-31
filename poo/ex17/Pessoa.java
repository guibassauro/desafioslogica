package poo.ex17;

public class Pessoa {
    private String nome;
    private int idade;

    private Pessoa pai;
    private Pessoa mae;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
