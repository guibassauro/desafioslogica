import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        
        int numero = getDados();

        printaTabuada(numero);
    }

    public static int getDados(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para revelar a sua tabuada:");
        int numero = sc.nextInt();
        sc.close();

        return numero;
    }

    public static void printaTabuada(int numero){
        for(int i=0; i<=10; i++){
            System.out.println(numero + "X" + i + "=" + (numero * i));
        }
    }
    
}
