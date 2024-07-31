import java.util.Scanner;

public class ex14{
    public static void main(String args[]){
        int segundos;
        int horasFull;
        int minutosFull;
        int segundosFull;

        segundos = getSecs();

        horasFull = getHoras(segundos);
        minutosFull = getMinutos(segundos);
        segundosFull = getSegundos(segundos);

        printHora(segundos, horasFull, minutosFull, segundosFull);

    }

    public static int getSecs(){
        int secs;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor em segundos:");
        secs = sc.nextInt();

        sc.close();
        return secs;
    }

    public static int getHoras(int secs){
        int horas = secs / 3600;

        return horas;
    }

    public static int getMinutos(int secs){
        int minutos = (secs % 3600) / 60;

        return minutos;
    }

    public static int getSegundos(int secs){
        int segundos = (secs % 3600) % 60;

        return segundos;
    }

    public static void printHora(int segundos, int horasFull, int minutosFull, int segundosFull){
        System.out.println(segundos + " segundos são " + horasFull + "h" + minutosFull + "min" + segundosFull + "seg.");
    }
}