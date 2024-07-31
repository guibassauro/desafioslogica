import java.util.Scanner;

class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a idade:");
        int idade = sc.nextInt();

        if(idade < 18){
            System.out.println("É menor de idade.");
        } else{
            System.out.println("É maior de idade.");
        }

        sc.close();
    }
    
}