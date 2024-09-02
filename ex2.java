import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();

        System.out.println("Digite o valor do produto:");
        double preco = sc.nextDouble();

        System.out.println("Digite a quantidade de unidades do produto:");
        int quantidade = sc.nextInt();

        preco = descontaValor(quantidade, preco);

        System.out.println("Nome do produto: " + nome);
        System.out.printf("Valor do produto: R$%.2f", preco);

        sc.close();
    }

    public static double descontaValor(int quantidade, double preco){
        
        if(quantidade > 50){
            return preco * 0.75;
        } else if(quantidade > 20){
            return preco * 0.7;
        } else if(quantidade > 10){
            return preco * 0.9;
        } else{
            return preco;
        }
    }
}
