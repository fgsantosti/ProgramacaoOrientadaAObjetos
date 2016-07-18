package Capitulo05;

import java.util.Scanner;

public class EstruturaFor {

    public static void main(String[] args) {
        /*
        Scanner ler;
        ler = new Scanner(System.in);
        int numero = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o número " + (i + 1) + "- ");
            numero = ler.nextInt();
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        for (int i = 100; i >= 0; i = 1 - 20) {
            System.out.println(i);
        }

        int i, soma;
        soma = 0;
        for (i = 30; i >= 5; i -= 1) {
            if ((i % 3) == 0) {
                System.out.println(""+ i);
                soma += i;
            }
        }
        System.out.println("Soma: "+soma);
         */

        int fat = 1;
        Scanner ler;
        ler = new Scanner(System.in);
        int num = ler.nextInt();

        for (int i = 1; i <= num; i++) {
            fat = fat * i;
        }
        System.out.println(fat);

    }
}
