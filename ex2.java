import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do produto:");
        String nome = sc.nextLine();

        System.out.println("Digite o valor do produto:");
        double preco = sc.nextInt();

        System.out.println("Digite a quantidade de unidades do produto:");
        double quantidade = sc.nextInt();

        if(quantidade > 50){
            preco = preco * 0.75;
        } else if(quantidade > 20){
            preco = preco * 0.7;
        } else if(quantidade > 10){
            preco = preco * 0.9;
        }

        System.out.println("Nome do produto: " + nome);
        System.out.println("Valor do produto: R$" + preco);

        sc.close();
    }
}
