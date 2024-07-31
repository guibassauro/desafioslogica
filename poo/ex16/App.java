package poo.ex16;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op=10;

        while(op != 0){
            System.out.println("Digite a sua opção:");
            op = sc.nextInt();

            switch(op){
                case 1:
                    Pessoa p1 = criaPessoa();
                    System.out.println(p1);
            }
        }

        sc.close();
    }
    public static Pessoa criaPessoa(){
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        long id = rd.nextInt();

        System.out.println("Digite o nome da pessoa:");
        String nome = sc.nextLine();

        Pessoa pessoa = new Pessoa(id, nome);

        sc.close();
        return pessoa;
    }
    
}
