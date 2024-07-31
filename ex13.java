import java.util.Scanner;

public class ex13 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto tirou na prova parcial");
        double notaparcial = sc.nextInt();
        System.out.println("Digite quanto tirou na prova trimestral");
        double notatrimestral = sc.nextInt();

        double notafinal =  calculaNota(notaparcial, notatrimestral);

        System.out.println(analisaNota(notafinal));

        sc.close();
    }

    public static double calculaNota(double parcial, double trimestral){
        double ffinal = ((parcial * 0.4) + (trimestral * 0.6));
        
        return ffinal;
    }

    public static String analisaNota(double nota){
        
        if(nota < 4){
            return "Reprovado";
        }

        if(nota < 6){
            return "Verificação Suplementar";
        }

        return "Aprovado";
    }
}
