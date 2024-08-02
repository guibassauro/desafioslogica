package poo.ex17;

public class Pessoa {
    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;


    public Pessoa(String nome, int idade){
        setNome(nome);
        setIdade(idade);
        setPai(null);
        setMae(null);
        
    }

    public void adicionarMae(Pessoa mae){

        if(this.mae != null){
            System.out.println("Esta pessoa já tem uma mãe");
        } else {
            setMae(mae);
            System.out.println("A mãe de " + this.getNome() + " é " + this.getMae().getNome());
        }
    }

    public void adicionarPai(Pessoa pai){

        if(this.pai != null){
            System.out.println("Esta pessoa já tem um pai");
        } else {
            setPai(pai);
            System.out.println("O pai de " + this.getNome() + " é " + this.getMae().getNome());
        }
    }

    public void printMember(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        if(this.mae != null){
            System.out.println("Mãe: " + this.getMae().getNome());
        } else{
            System.out.println("Mãe desconhecido");
        }

        if(this.pai != null){
            System.out.println("Pai: " + this.getPai().getNome());
        } else{
            System.out.println("Pai desconhecido");
        }
    }


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

    public Pessoa getPai(){
        return pai;
    }

    public void setPai(Pessoa pai){
        this.pai = pai;
    }

    public Pessoa getMae(){
        return mae;
    }

    public void setMae(Pessoa mae){
        this.mae = mae;
    }

}
