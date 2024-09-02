import java.util.Scanner;

public class ex13 {
    
    public static void main(String[] args) {

        double[] notas = getDados();
        double notaparcial = notas[0];
        double notatrimestral = notas[1];

        double notafinal = calculaNota(notaparcial, notatrimestral);

        System.out.println(analisaNota(notafinal));

    }

    public static double[] getDados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto tirou na prova parcial");
        double notaparcial = sc.nextDouble();
        System.out.println("Digite quanto tirou na prova trimestral");
        double notatrimestral = sc.nextDouble();

        sc.close();
        return new double[] {notaparcial, notatrimestral};
    }

    public static double calculaNota(double parcial, double trimestral){
        double notafinal = ((parcial * 0.4) + (trimestral * 0.6));
        
        return notafinal;
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
