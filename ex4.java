import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro valor:");
        double valor1 = sc.nextInt();

        System.out.println("Digite o segundo valor:");
        double valor2 = sc.nextInt();

        System.out.println("Digite a operação a ser feita:");
        String op = sc.next();

        calcula(valor1, valor2, op);

        sc.close();
    }

    public static void calcula(double valor1, double valor2, String op){
        switch (op) {
            case "+":
                System.out.println(valor1 + valor2);
                break;
        
            case "-":
                System.out.println(valor1 - valor2);
                break;

            case "*":
                System.out.println(valor1 * valor2);
                break;

            case "/":
                System.out.println(valor1 / valor2);
                break;
            
            default:
                System.out.println("Digite um valor válido");
                
        }
    }
    
}
