import java.util.Scanner;

public class ex7 {
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

        for(int i=0; i<=numero; i++){
            if(i == 0){
                System.out.println(0 + " ");
            } else if(i == 1){
                System.out.println(1 + " ");
            } else{
                int fib = num0 + num1;
                System.out.println(fib + " ");
                num0 = num1;
                num1 = fib;
            }
        }
    }
}
