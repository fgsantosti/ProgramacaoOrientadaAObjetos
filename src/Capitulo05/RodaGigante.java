package Capitulo05;

import java.util.Scanner;

public class RodaGigante {
    public static void main(String[] args) {
        
        Scanner ler;
        ler = new Scanner(System.in);
        
        System.out.println("Digite a quantidade giros: ");
        int qvoltas = ler.nextInt();
        
        
        if(qvoltas>1){
            for (int i = 1; i <= qvoltas; i++) {
                System.out.println("Giro "+i);
            }
        }else
            System.out.println("Você nao digitou uma quantidade positiva de voltas");
        
    }
}
