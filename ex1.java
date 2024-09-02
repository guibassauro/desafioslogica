import java.util.Scanner;

class ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva a idade:");
        int idade = sc.nextInt();

        String resultado = verficarIdade(idade);
        System.out.println(resultado);

        sc.close();
    }
    
    public static String verficarIdade(int idade){
        if(idade >= 18){
            return "É maior de idade";
        } else{
            return "É menor de idade";
        }
    }

    
    
}