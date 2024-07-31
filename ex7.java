import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = -1;

        System.out.println("Digite um valor inteiro não negativo:");
        op = sc.nextInt();

        if(op >= 0){
            int fib = 0;
            int ultNum = 0;
            int aux = 0;
            for(int i=0; i<=op; i++){
                System.out.print(fib + " ");

                if(fib == 0){
                    fib += 1;
                } else{
                    aux = fib;
                    fib += ultNum;
                    ultNum = aux;
                }
                
            }
        } else{
            System.out.println(op + " não é um valor inteiro não negativo");
        }

        sc.close();
        
    }
}
