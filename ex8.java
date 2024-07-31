import java.util.Scanner;

public class ex8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int op = 0;
        
        while(op != 10){
            System.out.println("Digite um número(10 encerra o loop):");
            op = sc.nextInt();
        }

        System.out.println("Loop encerrado.");
        sc.close();
    }
}
