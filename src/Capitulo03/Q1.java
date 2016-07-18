/*
1- Faça um programa que receba quatro números inteiros,
calcule e mostre a soma desses números.
 */

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0;
        Scanner dado;//cria var do tipo Scanner
        dado = new Scanner(System.in);//inicializando a var dado
        
        System.out.println("Digite numero 1:");
        num1= dado.nextInt();
        System.out.println("Digite numero 2:");
        num2= dado.nextInt();
        System.out.println("Digite numero 3:");
        num3= dado.nextInt();
        System.out.println("Digite numero 4:");
        num4= dado.nextInt();
        int soma = num1 + num2 + num3 + num4;
        
        System.out.println("A soma é\t "+soma);
    }
}
