import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {

        int numero = getOpcao();

        if(numero >= 0){
            printaFibonacci(numero);
        } else{
            System.out.println("Este número não é valido");
        }
    }

    private static int getOpcao(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro não negativo:");
        int numero = sc.nextInt();

        sc.close();
        return numero;
    }

    private static void printaFibonacci(int numero){
        int num0 = 0;
        int num1 = 1;
        int fib = num0 + num1;

        System.out.printf(num0 + " ");
        while(fib <= numero){
            System.out.printf(fib + " ");
            num1 = fib;
            fib = num0 + num1;
            num0 = num1;
        }
    }
}
