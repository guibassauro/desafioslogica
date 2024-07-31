import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número para revelar sua tabuada:");
        int numero = sc.nextInt();

        for(int i=0; i<=10; i++){
            System.out.println(numero + "X" + i + "=" + (numero * i));
        }

        sc.close();
    }
    
}
