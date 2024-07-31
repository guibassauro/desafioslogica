import java.util.Scanner;

public class calculadora {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor:");
        double valor1 = sc.nextDouble();

        System.out.println("Digite o segundo valor:");
        double valor2 = sc.nextDouble();

        System.out.println("Digite a operação a ser feita:");
        String op = sc.next();

        switch (op) {
            case "+":
                System.out.println(soma(valor1, valor2));
                break;
        
            case "-":
                System.out.println(subtracao(valor1, valor2));
                break;

            case "*":
                System.out.println(multiplicacao(valor1, valor2));
                break;

            case "/":
                System.out.println(divisao(valor1, valor2));
                break;
            
            default:
                System.out.println("Digite um valor válido");
                break;       
        }

        sc.close();
    }

    public static double soma(double valor1, double valor2){
        double valor = valor1 + valor2;

        return valor;
    }

    public static double subtracao(double valor1, double valor2){
        double valor = valor1 - valor2;

        return valor;
    }

    public static double multiplicacao(double valor1, double valor2){
        double valor = valor1 * valor2;

        return valor;
    }

    public static double divisao(double valor1, double valor2){
        double valor = valor1 / valor2;

        return valor;
    }
}
