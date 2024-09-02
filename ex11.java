import java.util.Random;

public class ex11 {
    
    public static void main(String[] args) {
        int[] vetor = geraNumeros();

        boobleSort(vetor);

        printaVetor(vetor);
        
    }

    private static int[] geraNumeros(){
        Random ranNum = new Random();
        int[] vetor = new int[100];

        for(int i=0; i<100; i++){
            vetor[i] = ranNum.nextInt(1000);
        }

        return vetor;
    }

    private static void boobleSort(int[] vetor){

        for(int i=0; i<vetor.length; i++){
            for(int j=0; j<vetor.length-1; j++){
                if(vetor[j] > vetor[j+1]){
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j+1] = aux;
                }
            }
        }
    }

    private static void printaVetor(int[] vetor){
        for(int i=0; i<vetor.length; i++){
            System.out.printf(vetor[i] + " ");
        }
    }
}
