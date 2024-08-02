package poo.ex17;

public class App {
    public static void main(String args[]){
        Pessoa pessoa1 = new Pessoa("João", 20);
        Pessoa pai1 = new Pessoa("Carlos", 49);
        Pessoa mae1 = new Pessoa("Macia", 48);

        pessoa1.adicionarMae(mae1);
        pessoa1.adicionarMae(pai1);
        pessoa1.adicionarPai(pai1);
        pessoa1.adicionarPai(mae1);

        pessoa1.printMember();
        System.out.print("\n");
        mae1.printMember();
        System.out.print("\n");
        pai1.printMember();
    }
    
}
