package Capitulo05;

import java.util.Scanner;

public class EstruturaWhile {

    public static void main(String[] args) {
        boolean ligado = true;
        int i = 0, qvoltas;
        
        Scanner dado;
        dado = new Scanner(System.in);
        System.out.println("Diga a quantidade de voltas: ");
        qvoltas =dado.nextInt();
                    
        while (ligado) {
            System.out.println("Em movimento");
            if (i >= qvoltas) {
                ligado = false;
            }
            System.out.println("Volta - " + i++);
        }
    }
}
